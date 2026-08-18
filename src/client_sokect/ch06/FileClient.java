package client_sokect.ch06;
/*
 * 서버와 미리 약속한 데이터 순서 준수 (프로토콜)
 * [1바이트] 파일 이름의 길이 (0~ 255)
 * [N바이트] 파일 이름
 * [나머지] 파일 내용
 */

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileClient {

    private static String HOST = "192.168.5.16";
    private static int PORT = 5000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("전송할 파일 경로 예) C:\\work_java\\test.txt");
        // String filePath = sc.nextLine(); (오류가 많이날수있음)
        String filePath = "C:\\yhj\\work_space\\java_class_1\\java_v1\\assets\\a.txt";

        File file = new File(filePath);
        // 방어적 코드
        if (!file.exists() || !file.isFile()) {
            System.out.println("파일이 존재하지 않거나 폴더 경로입니다 : " + filePath);
            return;
        }

        // 클라이언트 입장에서는 서버측에 경로를 제외하고 파일 명만 보내야 한다.
        // C:\work_java\test.txt --> text.txt만 경로에서 걸러내야한다.
        // 즉 경로를 통으로 보내면 서버가 엉뚱한 위치에 저장하게 되므로 이름만 보낸다(물론 방어적 코드 작성 되어있음)
        String fileName = file.getName();
        byte[] nameBytes = fileName.getBytes();

        // 이름의 길이를 1바이트에 담아서 보내므로 255를 넘으면 안된다 (약속)
        // 한글은 UTF-8기준에서 한 글자당 3바이트라서 최대 85글자정도가 한계
        if (nameBytes.length > 255) {
            System.out.println("파일 이름이 너무깁니다. (최대 255바이트)");
            return;
        }

        System.out.println("전송할 파일 : " + fileName + " ( " + file.length() + "바이트 )");

        try (Socket socket = new Socket(HOST, PORT)) {

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            // 1. 파일 이름의 길이전송 (1바이트)
            out.write(nameBytes.length);

            // 2. 파일 이름 전송 (N바이트)
            out.write(nameBytes);

            // 3. 파일 내용 전송 (나머지)
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[4096];
                int byteRead;
                while ((byteRead = fis.read(buffer)) != -1) {
                    out.write(buffer, 0, byteRead);
                }
            }
            out.flush();

            // 4. "다 보냈다" 신호 보내기
            socket.shutdownOutput();
            // 소켓은 나가는 방향만 닫는다. 다 종료 해버리면 들어오는 스트림도 닫혀서 응답을 받을수없다.
            System.out.println("전송 완료");

            // 5. 서버 응답 수신
            byte[] responseBuffer = new byte[1024];
            int responseLength = in.read(responseBuffer);
            if (responseLength > 0) {
                System.out.println("서버 응답 : " + new String(responseBuffer, 0, responseLength));
            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
