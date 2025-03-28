package main.java.com.homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("What is your age");
        int age = scanner.nextInt();

        System.out.println("your name is :" + name + " last name " + lastName + " age " + age);

    }
}
