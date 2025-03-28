package main.java.com.basics;

import java.util.Scanner;

public class _0_1_ScannerExample {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What's your age?");
        String age = scanner.nextLine();

        System.out.println("hello " + name + " your age is " + age);
    }
}
