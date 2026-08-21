package http.ch07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 데이터를 담는 클래스 DTO
 *
 * Gson은 자바객체와 JSON 문자열을 서로 바꿔주는 라이브러리이다
 * 그러려면 먼저 담을 클래스가 있어야한다
 * 필드 이름이 곧 JSON의 키가된다
 *
 * {"id" : 1, "name" : "홍길동", "email" : "asd@naver.com"}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
