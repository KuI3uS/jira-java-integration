package main.java.com.homework;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to display: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        for (int i = 0 ; i < n ; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
