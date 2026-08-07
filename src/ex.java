import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ex extends JFrame {

    public ex() {
        setTitle("캐릭터 이동 제한 예제 (드래그)");
        setSize(800, 600); // 프레임 기본 크기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. 이미지 로딩 (예제를 위해 이미지 경로를 직접 지정해야 합니다)
        // 실제 프로젝트에서는 정확한 파일 경로를 사용하세요.
        BufferedImage bgImage = null;
        BufferedImage charImage = null;
        try {
            // 경로 예시: "src/background.png", "C:/images/player.png"
            bgImage = ImageIO.read(new File("your_background_path.png")); // 배경 이미지 경로
            charImage = ImageIO.read(new File("your_character_path.png")); // 캐릭터 이미지 경로
        } catch (Exception e) {
            System.err.println("이미지를 불러오는데 실패했습니다. 경로를 확인하세요.");
            // 이미지가 없을 경우를 대비한 기본 대체 이미지 (분홍색 사각형)
            if(bgImage == null) bgImage = createDummyImage(700, 500, Color.LIGHT_GRAY);
            if(charImage == null) charImage = createDummyImage(50, 50, Color.MAGENTA);
        }

        // 2. 배경 및 캐릭터를 그릴 전용 패널 생성
        GamePanel gamePanel = new GamePanel(bgImage, charImage);
        add(gamePanel); // 프레임에 패널 추가

        // 프레임 크기를 패널(배경 이미지) 크기에 맞춤
        pack();
        setLocationRelativeTo(null); // 화면 중앙에 배치
        setVisible(true);
    }

    // 이미지를 찾지 못했을 때 사용할 더미 이미지 생성 메서드
    private BufferedImage createDummyImage(int width, int height, Color color) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = img.getGraphics();
        g.setColor(color);
        g.fillRect(0, 0, width, height);
        g.dispose();
        return img;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ex::new);
    }

    // --- 실제 그림을 그리고 이동 제한 로직이 포함된 컴포넌트 ---
    static class GamePanel extends JPanel {
        private BufferedImage backgroundImage;
        private BufferedImage characterImage;

        // 캐릭터의 현재 좌표 (왼쪽 상단 기준)
        private int charX = 100;
        private int charY = 100;

        // 배경과 캐릭터의 크기
        private int bgWidth;
        private int bgHeight;
        private int charWidth;
        private int charHeight;

        public GamePanel(BufferedImage bg, BufferedImage charImg) {
            this.backgroundImage = bg;
            this.characterImage = charImg;

            // 크기 정보 초기화
            this.bgWidth = backgroundImage.getWidth();
            this.bgHeight = backgroundImage.getHeight();
            this.charWidth = characterImage.getWidth();
            this.charHeight = characterImage.getHeight();

            // 패널의 기본 크기를 배경 이미지 크기로 설정 (pack() 호출 시 사용됨)
            setPreferredSize(new Dimension(bgWidth, bgHeight));

            // 마우스 드래그 리스너 등록
            MyMouseListener listener = new MyMouseListener();
            addMouseListener(listener);
            addMouseMotionListener(listener);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            // 1. 배경 이미지 그리기
            g2.drawImage(backgroundImage, 0, 0, null);

            // 2. 캐릭터 이미지 그리기 (제한된 좌표에)
            g2.drawImage(characterImage, charX, charY, null);
        }

        // 마우스 이벤트를 처리하는 내부 클래스
        class MyMouseListener extends MouseAdapter {
            private int offsetX, offsetY; // 캐릭터 내 마우스 클릭 지점 오프셋

            @Override
            public void mousePressed(MouseEvent e) {
                // 캐릭터 영역을 클릭했는지 확인
                if (e.getX() >= charX && e.getX() <= charX + charWidth &&
                        e.getY() >= charY && e.getY() <= charY + charHeight) {
                    // 클릭한 지점과 캐릭터 좌표 사이의 거리 계산 (드래그 시 튕김 방지)
                    offsetX = e.getX() - charX;
                    offsetY = e.getY() - charY;
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // 마우스의 현재 위치를 기반으로 새로운 캐릭터 좌표 계산
                int nextX = e.getX() - offsetX;
                int nextY = e.getY() - offsetY;

                // --- [핵심 로직] 경계 제한 (Boundary Clamping) ---

                // X축 제한: 0보다 작아지거나, (배경너비 - 캐릭터너비)보다 커지지 않게
                if (nextX < 0) {
                    nextX = 0;
                } else if (nextX > bgWidth - charWidth) {
                    nextX = bgWidth - charWidth;
                }

                // Y축 제한: 0보다 작아지거나, (배경높이 - 캐릭터높이)보다 커지지 않게
                if (nextY < 0) {
                    nextY = 0;
                } else if (nextY > bgHeight - charHeight) {
                    nextY = bgHeight - charHeight;
                }

                // 제한된 좌표를 실제 캐릭터 좌표에 적용
                charX = nextX;
                charY = nextY;

                // 화면 다시 그리기 요청
                repaint();
            }
        }
    }
}