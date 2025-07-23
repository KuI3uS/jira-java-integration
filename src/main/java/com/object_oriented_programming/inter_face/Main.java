package main.java.com.object_oriented_programming.inter_face;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        LengthPasswordValidator validator = new LengthPasswordValidator();

        SpecialCharactersPassword charactersPassword = new SpecialCharactersPassword();

        user.setPassword("Jak", validator);
    }
}
