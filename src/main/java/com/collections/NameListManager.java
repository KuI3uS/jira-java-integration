package main.java.com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class NameListManager {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);


        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Add name");
            System.out.println("2 - Remove name");
            System.out.println("3 - Show names");
            System.out.println("4 - Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a name to add: ");
                    String name = scanner.nextLine();
                    names.add(name);
                    break;
                case 2:
                    System.out.println("Enter a name to remove: ");
                    String RemoveName = scanner.nextLine();
                    names.removeIf(n -> n.equalsIgnoreCase(RemoveName));
                    break;
                case 3:
                    System.out.println(names);
                    break;
                case 4:
                    System.out.println("Bye");
                    running = false;
            }
        }

    }
}
