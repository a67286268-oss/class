package useful.ch03;

import com.oop9.Dog;

public class StringTest2 {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1);

        System.out.println(System.identityHashCode(str1));

        str1 = str1 + "World";
        System.out.println(str1);

    }

}
