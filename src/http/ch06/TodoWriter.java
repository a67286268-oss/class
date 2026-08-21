package http.ch06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TodoWriter {

    public static void main(String[] args) {

        // 자바 객체를 json문자열로 변환
        Todo todo = new Todo();
        todo.setUserId(100);
        todo.setId(400);
        todo.setTitle("오늘은 총 복습");
        todo.setCompleted(true);

        Gson gson = new Gson();
        System.out.println(todo);
        System.out.println();
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(prettyGson.toJson(todo));

    }
}
