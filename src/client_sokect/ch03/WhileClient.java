package client_sokect.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WhileClient {


    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost",5000)){

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while (true) {
                System.out.println("콘솔 로그 클라이언트 입력>>>>>");
                String input = keyboardReader.readLine().trim();
                writer.println(input);
                if ("exit".equalsIgnoreCase(input)) {
                    break; // 키보드 입력스트림 종료
                }

                String response = reader.readLine();
                if("exit".equalsIgnoreCase(response)) {
                    break;
                }

                System.out.println("서버측 응답 : " + response);

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
