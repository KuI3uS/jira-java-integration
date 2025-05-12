package main.java.com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class NameIndexSearcher {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("name : ");
        String name = scanner.nextLine();

        // TODO: Create ArrayList with 10 names
        names.add("Anna");
        names.add("Kuba");
        names.add("Zosia");
        names.add("Tomek");
        names.add("Ola");
        names.add("Marcin");
        names.add("Ewa");
        names.add("Basia");
        names.add("Kamil");
        names.add("Kasia");
        // TODO: Ask the user for a name and print the index(es) or not found message

        for (int i = 0 ; i < names.size() ; i++) {
            if(names.get(i).equals(name)){
                System.out.println("index" + i);
            }
        }
        if(!names.contains(name)){
            System.out.println("not found");
        }
    }
}
