package main.java.com.homework;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner scannes = new Scanner(System.in);
        System.out.println("enter a");
        int a = scannes.nextInt();
        System.out.println("enter b");
        int b = scannes.nextInt();
        System.out.println("enter c");
        int c = scannes.nextInt();

        if (a > b && a > c){
            System.out.println("a is the largest number from the given set " + a);
        }else if (b > a && b > c){
            System.out.println("b is the largest number from the given set " + b);
        }else if (c > a && c > b){
            System.out.println("c is the largest number from the given set " + c);
        }
    }
}
