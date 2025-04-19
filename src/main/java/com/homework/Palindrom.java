package main.java.com.homework;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Text = scanner.nextLine();

        String reversed = new StringBuilder(Text).reverse().toString();

        if (Text.equals(reversed)){
            System.out.println("is palindrom");
        }else
            System.out.println("is not palindrom");
    }
}
