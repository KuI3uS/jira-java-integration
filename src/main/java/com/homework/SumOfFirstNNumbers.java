package main.java.com.homework;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= n ; i++){
            System.out.println(i);
            sum += i;


        }
        System.out.println(sum);

    }
}
