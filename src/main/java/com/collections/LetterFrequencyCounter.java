package main.java.com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class LetterFrequencyCounter {
    public static void main(String[] args) {
        // TODO: Ask user for a sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String input = scanner.nextLine();


        // TODO: Count how many times each letter appears using HashMap

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }


        System.out.println(letterCount);
    }
}