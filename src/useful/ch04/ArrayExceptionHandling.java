package useful.ch04;

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i +" : " + arr1[i]);
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되지 않았음");



    }

}
