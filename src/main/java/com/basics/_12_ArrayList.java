package main.java.com.basics;

import java.util.ArrayList;

public class _12_ArrayList {
    public static void main(String[] args) {
        String name1 = "Jakub";
        String name2 = "Marta";
        String name3 = "Amelia";


        ArrayList<String> guests = new ArrayList<>();
        guests.add(name1);
        guests.add(name2);
        guests.add(name3);

        for (String name : guests){
            System.out.println(name);
        }

        System.out.println(guests.size());
        System.out.println(guests.remove("Amelia"));
    }
}
