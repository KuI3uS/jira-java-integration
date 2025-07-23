package main.java.com.object_oriented_programming.password;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Passwordvalidator passwordvalidator = new Passwordvalidator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        passwordvalidator.validatePassword(scanner.nextLine());

    }
}
