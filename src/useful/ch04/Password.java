package useful.ch04;

public class Password {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            throw new PasswordException("비밀번호는 null 일 수 없습니다");
        } else if (password.length() < 4) {
            throw new PasswordException("비빌번호는 4글자 이상이어여 합니다");
        }
        this.password = password;
    }


    public static void main(String[] args) {
        //String password = "123123";
        Password password = new Password();
        try {
            //password.setPassword(null);
            password.setPassword("123");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("비 정상종료 안됨");
    } // end of main

} // end of class


// 1. 사용자정의 예외 클래스를 설계
// 2. message 를 받아서 출력할 수 있도록 설계
// 3. setPassword 에 오류 안내 메세지를 직접 만들어 둔 예외 클래스로 활용하시오.
// 4. 예외 클래스 이름은 PasswordException 으로 설계

