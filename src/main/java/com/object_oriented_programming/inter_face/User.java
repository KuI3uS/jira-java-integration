package main.java.com.object_oriented_programming.inter_face;

public class User {
    public void setPassword(String password, PasswordValidator validator) {
        validator.isValid(password);
    }
}
