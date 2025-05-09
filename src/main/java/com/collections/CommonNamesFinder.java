package main.java.com.collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CommonNamesFinder {
    public static void main(String[] args) {
        // TODO: Create two ArrayLists with names
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Anna");
        list1.add("Kuba");
        list1.add("Zosia");
        list1.add("Mateusz");
        list1.add("Ola");
        list1.add("Paweł");
        list1.add("Basia");
        list1.add("Marcin");
        list1.add("Karol");
        list1.add("Kasia");

        list2.add("Ola");
        list2.add("Tomek");
        list2.add("Anna");
        list2.add("Agata");
        list2.add("Kamil");
        list2.add("Zosia");
        list2.add("Emilia");
        list2.add("Krzysztof");
        list2.add("Basia");
        list2.add("Ewa");
        // TODO: Find and print names present in both lists (without using retainAll or contains)

        List<String> common = new ArrayList<>();

        for (String name : list1) {
            for (String name2 : list2) {
                if (name.equals(name2)) {
                    common.add(name);
                }
            }
        }
        System.out.println(common);
    }
}
