package main.java.com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CapitalCityLookup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Create a HashMap with countries and their capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Poland", "Warsaw");
        capitals.put("Germany", "Berlin");
        capitals.put("USA", "Washington");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");


        System.out.println("Capital city lookup:");
        String city = scanner.nextLine();
        // TODO: Let the user ask for a country and return the capital

       for (String key : capitals.keySet()) {
           if (key.equalsIgnoreCase(city)) {
               System.out.println("Capital of " + key + " is: " + capitals.get(key));
           }
       }
       if (!capitals.containsKey(city)) {
           System.out.println("No city found");
       }
    }
}