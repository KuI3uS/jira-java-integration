package main.java.com.homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the number b: ");
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);


    }
}
