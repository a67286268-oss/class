package socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Period;

public class FileServer {

    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "uploads";

    // (서버 - 클라이언트 약속) : 프로토콜
    // [1 바이트] 파일의 이름의 길이 (0 ~ 255) -> [1][1][1][1][1][1][1][1] 8bit
    // [N 바이트] 파일 이름
    // [나머지] 파일 내용 (클라이언트가 출력 방향을 닫으면 끝(-1))


    public static void main(String[] args) {


        // File 객체 - 경로가 적힌 쪽지 일뿐, 실제 폴더나 파일이 아니다.
        // 아래 한 줄로는 uploads 폴더가 만들어지지 않는다
        // 그냥 uploads 경로를 가르키는 객체가 생겼을뿐
        File dir = new File(UPLOAD_DIR);

        if (!dir.exists()) {
            // mkdirs() 을 호출하는 순간 비로서 실제 폴더가 만들어짐
            // mkdir() 과 달리 중간 경로까지 한번에 만들어준다
            boolean created = dir.mkdirs();
            System.out.println("업로드 폴더생성 : " + created);
        }

        System.out.println("파일 서버 시작 - 포트 : " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            Socket socket = serverSocket.accept(); // 연결 될 때까지 여기서 블로킹
            System.out.println("클라이언트 연결 됨 : " + socket.getInetAddress().getHostAddress());

            // 소켓에 연결된 입출력 스트림 준비
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            // 1. 파일이름의 길이읽기 (1바이트)
            // byte가 아니라 int 돌려주는 이유
            // byte는 -128 ~ 127 이라 "끝(-1)을 표현할 자리가 없다.
            // 그래서 0 ~ 255는 데이터를 구분해서 -1이 들어오면 끝 신호로 구분해서 쓴다 (read())
            int nameLength = in.read();

            // 방어적 코드
            // 이 검사를 빼면 아래에서는 new byte[-1] 이 되어 오류가 발생한다.
            if (nameLength == -1) {
                System.out.println("클라이언트가 아무것도 보내지않고 종료했습니다.");
                return;
            }
            System.out.println("파일의 이름 길이 : " + nameLength + "바이트로 들어온다고 확인");

            // 2. 파일 이름을 정확하게 nameLength만큼 읽기
            byte[] nameBuffer = new byte[nameLength];
            int nameRead = 0; // 지금까지 읽어서 채운 바이트 수
            // while 문법이 이번 예제의 가장 중요한 부분
            // read(값을 담을 배열, 시작 위치, 최대개수)는 요청한 만큼 반드시 읽어준다는 보장이없다
            // 네트워크 사정에 따라 총 30바이트를 받는다고 가정하면 첫 번째에 3바이트만 올수도있다.
            while (nameRead < nameLength) {
                int count = in.read(nameBuffer, nameRead, nameLength - nameRead);
                if (count == -1) {
                    throw new IOException("파일 이름을 받는중에 연결이 끊겼습니다.");
                }
                // 받은 만큼 커서를 앞으로 민다. 이줄이 없으면 무한 루프가되어버림
                nameRead += count;

            }
            // 예 : a.zip을 받는 경우 --> [5칸(a . z i p)] [파일내용....]

            String fileName = new String(nameBuffer); // 바이트로 들어온 데이터를 문자열로 생성
            // 방어적 코드 : 악의적인 클라이언트가 "../../비밀.txt"와 같은 이름을 보내면
            if (fileName.contains("..") || fileName.contains("/") || fileName.contains("\\")) {
                System.out.println("허용되지 않는 파일 이름입니다 : " + fileName);
                return;
            }
            System.out.println("수신할 파일 이름 : " + fileName);

            // 3. 파일 내용을 받아서 서버측 컴퓨터 디스크에 저장

            // 여기서도 아직 파일은 만들어지지 않았음 경로를 가르키는 객체일뿐
            File target = new File(dir,fileName);
            // FileOutputStream 생성자가 실행되는 순간 디스크에 실제파일이 생김
            FileOutputStream fos = new FileOutputStream(target);
            byte[] buffer = new byte[4096]; // 4kb 운영체제가 디스크를 다루는 단위와 맞춤크기
            int bytesRead;
            long total = 0;

            // 클라이언트가 shutdownOutput()을 호출하면 (클라이언트가 소켓 close 전에 -1을 보낼수있다)
            // 그 신호가 도착해서 read()가 -1을 반환
            while ( (bytesRead = in.read(buffer)) != -1 ) {
                fos.write(buffer, 0 , bytesRead);
                total += bytesRead;
            }
            System.out.println("저장 완료 : " + target.getPath() + " 총 " + total + "바이트");

            // 4. 완료 응답 전송
            // 클라이언트 출력 방향만 닫았고 입력 방향은 살아있으므로 서버가 보낸 응답을 정상적으로 받을수 있다.
            out.write(("업로드 성공 : " + fileName).getBytes());
            out.flush(); // 통로에 남은 데이터를 다 밀어낸다



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
