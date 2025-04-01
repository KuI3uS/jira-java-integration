package main.java.com.homework;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number A: ");
        int a = scanner.nextInt();
        System.out.println("Enter number B: ");
        int b = scanner.nextInt();

        System.out.println("because you want to do with numbers ?");
        System.out.println("addition, subtraction, multiplication, divisio");

        String operation = scanner.next();

        switch (operation){
            case "addition" -> System.out.println("the result is : " + (a + b));
            case "subtraction" -> System.out.println("the result is : " + (a - b));
            case "multiplication" -> System.out.println("the result is: " + (a * b));
            case "divsio" -> System.out.println("the result is : " + (a / b));
            default -> System.out.println("Incorrect numbers");
        }
    }
}
