package service;

import model.User;

public class UserManager {
    private static User user = new User("admin", "1234");

    public static boolean login(String u, String p) {
        return user.getUsername().equals(u) && user.getPassword().equals(p);
    }
}