package main.java.com.homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tell me what % you got from the exam :");
        int exam = scanner.nextInt();

        if (exam == 0 || exam < 60) {
            System.out.println("your score is 1");
        } else if (exam == 60 || exam <= 69) {
            System.out.println("your score is 2");
        } else if (exam == 69 || exam <= 79) {
            System.out.println("your score is 3");
        } else if (exam == 80 || exam <= 89) {
            System.out.println("your score is 4");
        } else if (exam == 90 || exam <= 100) {
            System.out.println("your score is 5");
        } else {
            System.out.println("there is no such range");
        }
    }
}
