package main.java.com.object_oriented_programming.inter_face;

public class LengthPasswordValidator implements PasswordValidator {


    @Override
    public boolean isValid(String password) {
        if (password.length() < 6 ){
            System.out.println("password is too short");
            return false;
        } else {
            System.out.println("password is good");
            return true;
        }
    }
}
