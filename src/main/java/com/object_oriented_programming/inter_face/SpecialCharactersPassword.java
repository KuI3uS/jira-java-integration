package main.java.com.object_oriented_programming.inter_face;

public class SpecialCharactersPassword implements PasswordValidator {
    @Override
    public boolean isValid(String password) {
        if (password.contains("@")||password.contains("#")){
            return true;
        } else {
            System.out.println("password requires one special character");
            return false;
        }
    }
}
