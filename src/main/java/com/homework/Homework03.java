package main.java.com.homework;

import java.nio.charset.StandardCharsets;

public class Homework03 {
    public static void main(String[] args) {
        String text = "  My name is Jakub   ";

        text = text.toUpperCase().substring(5).strip();

        System.out.println(text);
    }
}
