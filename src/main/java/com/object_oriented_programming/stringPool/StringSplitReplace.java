package main.java.com.object_oriented_programming.stringPool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitReplace {
    public static void main(String[] args) {
        String name = "Jakub;Marta;Tomek;Wiktor";
        String [] words = name.split(";");

        List<String> wordsList = new ArrayList<>();
        wordsList.addAll(Arrays.asList(words));

        System.out.println(wordsList.size());
    }
}
