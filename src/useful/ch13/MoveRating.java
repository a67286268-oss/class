package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class MoveRating {

    public static void main(String[] args) {

        List<String> movies = new ArrayList<>();

        movies.add("범죄도시 - ***");
        movies.add("기생충 - *****");
        movies.add("아바타 - *****");
        movies.add("오디세이 - ****");

        System.out.println("======영화목록======");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + "." + movies.get(i));
        }

        System.out.println("\n" + movies.size() + "편" +
                "");

    }

}
