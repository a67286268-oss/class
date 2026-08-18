package socket.ch06_1;

import starcraft.ver_1.ver5.Unit;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.IllformedLocaleException;
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

            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            int nameLength = in.read();
            if (nameLength == -1) {
                System.out.println("클라이언트가 아무것도 보내지 않았습니다.");
                return;
            }
            System.out.println("파일의 이름 길이 : " + nameLength + "바이트로 들어온다고 확인");

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
            System.out.println("수신할 파일 이름 : " + fileName);

            File target = new File(dir,fileName);
            FileOutputStream fos = new FileOutputStream(target);
            byte[] buffer = new byte[4096];
            int bytesRead;
            long total = 0;

            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                total += bytesRead;
            }
            System.out.println("저장 완료 : " + target.getPath() + " 총 " + total + "바이트");
            out.write(("업로드 성공 : " + fileName).getBytes());
            out.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
