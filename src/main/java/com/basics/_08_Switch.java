package main.java.com.basics;

import java.util.Scanner;

public class _08_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String light = scanner.nextLine();

        switch (light){
            case "green" -> System.out.println("go");
            case "yellow" -> System.out.println("wait");
            case "red" -> System.out.println("stop");
            default -> System.out.println("wrong color");
        }
    }
}
