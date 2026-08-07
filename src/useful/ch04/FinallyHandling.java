package useful.ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("숫자를 입력하세요");
            int result = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요");
        }catch (Exception e2) {
            System.out.println("알수없는 오류");
        } finally {
            sc.close();
            // 반드시 수행되어야 할 코드 영역
            // 심지어 return 키워드를 만나더라도 여기는 수행이 됩니다.
        }



        System.out.println("===========================");
        System.out.println("프로그랩이 비정상 종료 안됨");

        //scanner.close(); // 메모리 누수 방지

    }
}
