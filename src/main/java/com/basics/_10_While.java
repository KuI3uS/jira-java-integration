package main.java.com.basics;

import java.util.Scanner;

public class _10_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Type Yes if you do not want to end the program:");
            String text = scanner.nextLine();

            if (text.equals("Yes")){
                shouldContinue = true;
            } else if (text.equals("No")){
                shouldContinue = false;
            }

        }


    }
}
