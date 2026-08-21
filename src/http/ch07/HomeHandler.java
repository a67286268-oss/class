package http.ch07;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.net.SocketImpl;

/**
 * GET 요청 처리
 * -- 만드는 규칙 --
 * 1. HttpHandler 인터페이스를 구현한다.
 * 2. handler(HttpExchange) 메서드 하나를 재정의한다.
 * 3. main 에서 createContext 로 경로를 짝지어 등록한다.
 */
public class HomeHandler implements HttpHandler {

    private static final String HOME_PAGE = """
            <!doctype html>
            <html lang="ko">
              <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>나의 HTTP 서버</title>
              </head>
              <body>
                <h1>내가 자바로 만든 순수 HTTP 서버</h1>
                <ul>
                  <li><a href="/health">서버 상태 확인</a></li>
                  <li><a href="/api/users">사용자 목록(JSON)</a></li>
                </ul>
              </body>
            </html>
            
            """;

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String path = exchange.getRequestURI().getPath();

        try {


            if (!path.equals("/")) {
                SimpleHttpServer.sendResponse(exchange, 404,
                        SimpleHttpServer.TYPE_TEXT, "404 Not Found : " + path);
                return;
            }

            SimpleHttpServer.sendResponse(exchange, 200, SimpleHttpServer.TYPE_HTML, HOME_PAGE);

        } finally {
            exchange.close();
        }
    }
}

