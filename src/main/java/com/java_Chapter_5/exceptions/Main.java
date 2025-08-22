package main.java.com.java_Chapter_5.exceptions;

public class Main {
    public static void main(String[] args) {
        WordProcessor wordProcessor =new WordProcessor ("programiwanie");

        String procesorWord = wordProcessor.stripAndCapitalize();
        System.out.println(procesorWord);

        String[] names = new String[3];
        names[0] = "Jakub";
        names[1] = "Jakub";
        names[2] = "Marta";

        for (int i=0 ; i <= names.length ; i++ ) {
            System.out.println(names[i]);
        }
    }
}
