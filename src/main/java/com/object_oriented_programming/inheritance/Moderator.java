package main.java.com.object_oriented_programming.inheritance;

public class Moderator extends User {
    public void editPost (String post, int id) {
        System.out.println("Editing post " + post + " with id " + id);
    }
}
