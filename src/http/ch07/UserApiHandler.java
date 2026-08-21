package http.ch07;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

// /api/users -
// GET : 목록을 조회
// POST : 새 사용자를 등록
public class UserApiHandler implements HttpHandler {

    private static final List<User> userList = new ArrayList();
    private static int nextId = 1;

    // static 초기화 블록
    // 클래스가 메모리에 처음 올라갈때 딱 한번 실행되는 코드 묶음
    // 이름도 없고, 호출하지도 않는다 JVM이 알아서 실행함
    static {

        addUser(new User("홍길동", "asdf@naver.com"));
        addUser(new User("강금두", "qwe@naver.com"));
    }

    private static synchronized int addUser(User user) {
        user.setId(nextId); // 최초 1 <- 들어감
        nextId++;
        userList.add(user);
        return user.getId();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            // api/users 경로 + Method (동작 정의) - GET, POST
            // 경로가 같아서 Method가 다르면 하는일이 다르다
            // 그래서 이 핸들러 안에서 메서드로 한번 더 갈라준다.
            String method = exchange.getRequestMethod();

            if (method.equals("GET")) {
                handleGet(exchange);
            } else if (method.equals("POST")) {
                handlePost(exchange);
            } else {
                exchange.getRequestHeaders().set("Allow", "GET, POST");
                SimpleHttpServer.sendResponse(exchange,405,
                        SimpleHttpServer.TYPE_TEXT, "지원하지 않는 메서드 입니다");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exchange.close();
        }
    }

    /**
     * 목록을 복사해서 다시 돌려준다.
     * 복사하는 이유 : 원본을 그대로 넘기면, Gson이 JSON으로 바꾸면서 순회도중
     * 다른 스레드가POST로 add요청을 만약 한다면 중간에 예외가 발생한다
     * 즉, 순회도중에 ArrayList의 크기가 바뀌면 예외를 던지는 증상이있다
     */
    private ArrayList<User> copyUserList() {
        return new ArrayList<>(userList);
    }

    private void handleGet(HttpExchange exchange) throws IOException {
        SimpleHttpServer.sendJson(exchange, 200, copyUserList());
    }

    // POST요청 : 요청 본문(HTTP 요청 메세지 바디)이 있다.
    private void handlePost(HttpExchange exchange) throws  IOException {
        // 1. HTTP 요청 바디 읽기
        String requestBody = SimpleHttpServer.readRequestBody(exchange);
        System.out.println("POST 요청 본문 확인 : " + requestBody);

        // 2. Json 문자열을 User로 변환
        // 주의 :
        User user;

        try {
            user = new Gson().fromJson(requestBody, User.class);

        } catch (JsonSyntaxException e) {
            SimpleHttpServer.sendResponse(exchange,400,
                    SimpleHttpServer.TYPE_TEXT, "JSON 형식이 올바르지 않습니다");
            return;
        }

        // 3. 검증
        if (user == null || user.getName() == null || user.getName().isBlank()) {
            SimpleHttpServer.sendResponse(exchange, 400,
                    SimpleHttpServer.TYPE_TEXT, "name은 반드시 있어야합니다.");
            return;
        }

        if (user.getEmail() == null) {
            user.setEmail("");
        }

        // 4. 저장 처리 id값은 고정값이 아니라서 저장결과를 다시 돌려준다.
        int newId = addUser(user);

        // 5. 등록 성공은 200대신 201로 Created로 응답한다.
        SimpleHttpServer.sendJson(exchange, 201, user);

    }
}
