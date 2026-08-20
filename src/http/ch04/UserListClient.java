package http.ch04;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.print.attribute.standard.NumberUp;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class UserListClient {

    public static void main(String[] args) {

        String urlString = "https://jsonplaceholder.typicode.com/users";
        HttpURLConnection conn = null;

        try {
            URL url = new URL(urlString);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("요청 실패");
                return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {

                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }

                Gson gson = new Gson();
                TypeToken<List<User>> typeToken = new TypeToken<>() {};
                List<User> userList = gson.fromJson(sb.toString(), typeToken.getType());
                System.out.println("회원 수 : " + userList.size());
                System.out.println("=====================================");
                System.out.println(userList.get(3));


            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }

        }
    }
}