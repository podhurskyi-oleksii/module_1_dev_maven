package example.app;

import com.google.gson.Gson;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        User user = new User("Oleksii", "Podhurskyi");
        System.out.println(new Gson().toJson(user));
    }
}
