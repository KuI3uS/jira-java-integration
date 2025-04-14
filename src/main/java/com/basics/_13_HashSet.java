package main.java.com.basics;

import java.util.HashSet;

public class _13_HashSet {
    public static void main(String[] args) {
        String name1 = "Jakub";
        String name2 = "Marta";
        String name3 = "Martyna";

        HashSet<String> set1 = new HashSet<>();
        set1.add(name1);
        set1.add(name2);
        set1.add(name3);

        for (String name : set1){
            System.out.println(name);
        }
    }
}
