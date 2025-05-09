package main.java.com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class GenderCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String>guees = new ArrayList<>();
        // TODO: Ask user how many names they want to enter

        System.out.println("How many names would you like to provide? : ");
        int name = scanner.nextInt();

        // TODO: Collect names into an ArrayList
        System.out.println("Give me your names :");

        for (int i = 0; i < name; i++) {
            String names = scanner.next();
            guees.add(names);
        }

        int maleCount = 0;
        int femaleCount = 0;
        // TODO: Count female (ending with 'a') and male names
        for (String names : guees){
            if (!names.isEmpty()){
                char last = names.charAt(names.length()-1);

                if (last == 'a'){
                    maleCount++;
                }
                else {
                    femaleCount++;
                }
            }
        }
        System.out.println("number of women: " + femaleCount + " " + "Number of guys: " + maleCount);
    }
}
