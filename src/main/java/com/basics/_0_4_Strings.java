package main.java.com.basics;

public class _0_4_Strings {
    public static void main(String[] args) {
        String name = "Jakub";
        int length = name.length();

        System.out.println(name);
        System.out.println(length);


        String text = "My name is Jakub and like program";
        text = text.replace(" ", "-");
        System.out.println(text);
    }
}
