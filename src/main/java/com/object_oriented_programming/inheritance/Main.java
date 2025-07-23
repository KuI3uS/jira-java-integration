package main.java.com.object_oriented_programming.inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.addPost("nowy post");

        Moderator moderator = new Moderator();
        moderator.addPost("moderator post");

        Admin admin = new Admin();

        admin.deletePost(2);

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(moderator);
        users.add(admin);
    }
}
