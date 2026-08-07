package useful.ch02;

public class ReplaceMain {

    public static void main(String[] args) {
        // 개념정리 replace는 문자열 안에서 특정 문자나 문자열을 찾아 다른 값으로 바꾼
        // 새로운 문자열을 반환하는 메서드
        // 1. 원본은 절대 바뀌지않는다
        // 2. 일치하는 부분을 전부 바꾼다
        // 3. 두 가지 메서드 오버로딩이 존재한다

        // 1. char을 다른char로 바꾸기
        String fruit = "banana";
        String result = fruit.replace('a', 'e');
        System.out.println(fruit + "     ,     " + result);

        // 2. 문자열 다위로 바꾸기
        String phone = "010-1245-1542";
        String result2 = phone.replace("-", " ");
        System.out.println(result2);

        // 3. 활용
        String sentence = "자바는 재미있다. 자바는 어렵기도하다";
        String result3 = sentence.replace("자바","JAVA");
        System.out.println(result3);


    }

}
