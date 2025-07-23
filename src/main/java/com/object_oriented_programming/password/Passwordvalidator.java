package main.java.com.object_oriented_programming.password;

public class Passwordvalidator{
    public void validatePassword(String password) {
        validatorLength(password);
        validatorSpecialCharacter(password);
    }
    private void validatorLength(String password) {
        if (!(password.length() > 8 )) {
            System.out.println("Password must be between 8 and 16 characters");
        } else {
            System.out.println("Password" + password);
        }
    }
    private void validatorSpecialCharacter(String password) {
        if (!(password.contains("@") || password.contains("#") || password.contains("$"))) {
            System.out.println("Password must contain at least one @ or # or $");
        }
    }
}
