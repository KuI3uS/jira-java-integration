package main.java.com.basics;

import java.util.Scanner;

public class _07_ConditionalInstructions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();





        if (age >= 18 && name.endsWith("a")){
            System.out.println("you are a woman and you are of age");
        } else if (age >= 18 && !name.endsWith("a")){
            System.out.println("you are a man and you are of age");
        } else if (age < 18 && name.endsWith("a")){
            System.out.println("you are a woman and you are not of age");
        } else if (age < 18 && !name.endsWith("a")) {
            System.out.println("you are a boy and you are not of age");
        } else {
            System.out.println("unknown command");
        }
    }
}
