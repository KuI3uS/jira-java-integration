package main.java.com.homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tell me what year I am");
        int year = scanner.nextInt();

        if (year % 4 == 0  && year % 100 != 0 || year % 400 == 0){
            System.out.println("it is a leap year");
        }else{
            System.out.println("it is not a leap year");
        }

    }
}
