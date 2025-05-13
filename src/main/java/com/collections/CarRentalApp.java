package main.java.com.collections;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CarRentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <String, Boolean> cars = new HashMap<>();
        cars.put("Ford", true);
        cars.put("Audi", true);
        cars.put("BMW", true);
        cars.put("Honda", true);
        cars.put("Opel", true);

        List<String> rentedCars = new ArrayList<>();
        boolean running = true;

        while(running) {
            System.out.println("1.Show all cars");
            System.out.println("2.Show available cars");
            System.out.println("3.Show Rented cars");
            System.out.println("4.how my rented cars");
            System.out.println("5.Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Show Car");
                    for (String car : cars.keySet()) {
                        boolean available = cars.get(car);
                        String status = available ? "Available" : "Not Available";
                        System.out.println(car + " " + status);
                    }
                    break;
                case 2:
                    System.out.println("Show available cars");
                    for (String car : cars.keySet()) {
                        if (cars.get(car)) {
                            System.out.println(car);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Show Rented cars");
                    if (rentedCars.size() >= 3) {
                        System.out.println("You can't rent more than 3 cars.");
                    }
                    for (String car : cars.keySet()) {
                        if (cars.get(car)) {
                            System.out.println("-" + car);
                        }
                    }
                    scanner.nextLine();
                    System.out.println("Enter the name of the car you want to rent: ");
                    String carName = scanner.nextLine();

                    if (!cars.containsKey(carName)) {
                        System.out.println("That car doesn't exist.");
                    } else if (!cars.get(carName)) {
                        System.out.println("Sorry, that car is already rented.");
                    } else {
                        rentedCars.add(carName);
                        cars.put(carName, false);
                        System.out.println("Rented car " + carName);
                    }
                    break;
                case 4:
                    System.out.println("Show my rented cars");
                    if(rentedCars.isEmpty()) {
                        System.out.println("No cars rented.");
                    }else {
                        System.out.println("You have ");
                        for (String car : rentedCars) {
                            System.out.println(car);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Bye");
                    running = false;
            }
        }
    }
}
