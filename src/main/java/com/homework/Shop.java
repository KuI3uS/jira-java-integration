package main.java.com.homework;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give my the price :");
        double price = scanner.nextInt();

        System.out.println("what is the discount :");
        double discount = scanner.nextDouble();

        double fixedPrice = price * discount/100;


        System.out.println("price is :" + (price - fixedPrice));


    }
}
