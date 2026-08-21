package http.ch07;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import lombok.Data;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  핸들러(handler) 란
 *  다루다, 처리하다 라는 뜻이며 핸들러는 처리하는 쪽 이라는 뜻이다.
 *  프로그래밍에서 어떤 일이 일어났을 때 실행될 코드를 가리킬 때 쓴다
 */
public class TimeHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            if ("GET".equalsIgnoreCase(exchange.getRequestMethod())) {
                LocalDateTime time = LocalDateTime.now();
                DateTimeFormatter korean = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
                String now = time.format(korean);

                TimeDto timeDto = new TimeDto(now);
                SimpleHttpServer.sendJson(exchange, 200, timeDto);
            } else {
                SimpleHttpServer.sendResponse(exchange, 405,
                        SimpleHttpServer.TYPE_TEXT, "지원하지 않습니다.");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            exchange.close();
        }
    }

    @Data
    static class TimeDto {
        private String serverTime;

        public TimeDto(String serverTime) {
            this.serverTime = serverTime;
        }
    }

}