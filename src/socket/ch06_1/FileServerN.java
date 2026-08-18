package socket.ch06_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class FileServerN {

    private static final int PORT = 5001;
    private static final String UPLOAD_DIR = "uploads";
    private static Vector<File> fileVector = new Vector<>();

    public static void main(String[] args) {

        File dir = new File(UPLOAD_DIR);
        if (!dir.exists()) {
            boolean created = dir.exists();
            System.out.println("업로드 폴더 생성 : " + created);
        }
        System.out.println("포트 : " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결 됨 : " + socket.getInetAddress());

            // 클라이언트마다 새로운 스레드를 할당하여 병렬 처리
            new Thread(() -> handleClient(socket, dir)).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void handleClient(Socket socket, File dir) {
        try (
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream()
        ) {
            int nameLength = in.read();
            if (nameLength == -1) {
                System.out.println("클라이언트가 아무것도 보내지 않았습니다.");
                return;
            }

            byte[] nameBuffer = new byte[nameLength];
            int nameRead = 0;
            while (nameRead < nameLength) {
                int count = in.read(nameBuffer, nameRead, (nameLength - nameRead));
                if (count == -1) {
                    throw new IOException("파일 이름을 받는중 연결끊김");
                }
                nameRead += count;
            }

            String fileName = new String(nameBuffer);
            if (fileName.contains("..") || fileName.contains("/") || fileName.contains("\\")) {
                System.out.println("허용되지 않는 파일명 양식입니다");
                return;
            }
            System.out.println(Thread.currentThread().getName() + " - 수신할 파일 이름 : " + fileName);

            File target = new File(dir, fileName);
            try (FileOutputStream fos = new FileOutputStream(target)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                long total = 0;

                while ((bytesRead = in.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                    total += bytesRead;
                }
                System.out.println(Thread.currentThread().getName() + " - 저장 완료 : " + target.getPath() + " 총 " + total + "바이트");

                out.write(("업로드 성공 : " + fileName).getBytes());
                out.flush();

                // 업로드 성공한 파일을 Vector에 추가 (동기화되어 있으므로 여러 스레드가 동시에 add해도 안전함)
                fileVector.add(target);
                System.out.println("서버 전체 누적 업로드 파일 수: " + fileVector.size() + "개");
            }
        } catch (IOException e) {
            System.out.println("클라이언트 통신 에러: " + e.getMessage());
        } finally {
            try {
                socket.close(); // 처리가 끝난 소켓은 반드시 닫아줌
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

