package model;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    static Map<String, String> data = new HashMap<>();

    static {
        data.put("pblues@gmail.com", "123");
        data.put("lbp@gmail.com", "123");
        data.put("pblues", "pblues");
    }

    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User checkLogin(String email, String pass) {
        if (!data.containsKey(email)) return null;
        else if (pass != null && pass.equals(data.get(email))) {
            return new User(email, pass);
        }
        return null;
    }
}
