package main.java.com.basics;

import java.util.HashMap;
import java.util.Set;

public class _14_HaszMap {
    public static void main(String[] args) {

        HashMap<String ,String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("Romania","Romania");
        countriesAndCapitals.put("England","England");
        countriesAndCapitals.put("Germany","Germany");


        Set<String> kay = countriesAndCapitals.keySet();

        for (String key : kay){
            System.out.println( key + " - " +
                    countriesAndCapitals.get(key));
        }
    }
}
