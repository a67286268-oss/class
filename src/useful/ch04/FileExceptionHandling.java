package useful.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test1.txt");
            return;
        } catch (FileNotFoundException e) {
            System.out.println("test1 파일을 찾을수 없다");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 반드시 수행
            System.out.println("finally 수행");
        }

    }

}
