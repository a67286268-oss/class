package http.ch04;

//{
//        "id": 1,
//        "name": "Leanne Graham",
//        "username": "Bret",
//        "email": "Sincere@april.biz",
//        "address": {
//        "street": "Kulas Light",
//        "suite": "Apt. 556",
//        "city": "Gwenborough",
//        "zipcode": "92998-3874",
//        "geo": {
//        "lat": "-37.3159",
//        "lng": "81.1496"
//        }
//        },
//        "phone": "1-770-736-8031 x56442",
//        "website": "hildegard.org",
//        "company": {
//        "name": "Romaguera-Crona",
//        "catchPhrase": "Multi-layered client-server neural-net",
//        "bs": "harness real-time e-markets"
//        }
//}

import com.google.gson.Gson;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UserClient {
    public static void main(String[] args) {

        String urlString = "https://jsonplaceholder.typicode.com/users/1";
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
                User user = gson.fromJson(sb.toString(), User.class);
                System.out.println("결과");
                System.out.println("id : " + user.getId());
                System.out.println("name : " + user.getName());
                System.out.println("username : " + user.getUsername());
                System.out.println("email : " + user.getEmail());
                System.out.println("address : {");
                System.out.println("   street : " + user.getAddress().getStreet());
                System.out.println("   suite : " + user.getAddress().getSuite());
                System.out.println("   city : " + user.getAddress().getCity());
                System.out.println("   zipcode : " + user.getAddress().getZipcode());
                System.out.println("   geo : {");
                System.out.println("      lat : " + user.getAddress().getGeo().getLat());
                System.out.println("      lng : " + user.getAddress().getGeo().getLng());
                System.out.println("   }");
                System.out.println("}");
                System.out.println("phone : " + user.getPhone());
                System.out.println("website : " + user.getWebsite());
                System.out.println("company : {");
                System.out.println("   name : " + user.getCompany().getName());
                System.out.println("   catchPhrase : " + user.getCompany().getCatchPhrase());
                System.out.println("   bs : " + user.getCompany().getBs());
                System.out.println("}");

                System.out.println(user);

            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



