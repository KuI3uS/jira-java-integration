package main.java.com.object_oriented_programming.carProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("specify the car make");
        String make = scanner.nextLine();
        System.out.println("specify the car model");
        String model = scanner.nextLine();
        System.out.println("specify the car year");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("specify the car color");
        String color = scanner.nextLine();
        System.out.println("specify the car maxSpeed");
        int maxSpeed = Integer.parseInt(scanner.nextLine());
        System.out.println("specify the car range");
        int range = Integer.parseInt(scanner.nextLine());

        Car car = new Car(make, model, year, color,maxSpeed, range);

        System.out.println("The car make is: " + car.getMake());
        System.out.println("The car model is: " + car.getModel());
        System.out.println("The car year is: " + car.getYear());
        System.out.println("The car color is: " + car.getColor());
        System.out.println("The car maxSpeed is: " + car.getMaxSpeed());
        System.out.println("The car range is: " + car.getRange());

        while (true){
            System.out.println("1. go ");
            System.out.println("2. refuel");
            System.out.println("3. exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1 -> {
                    System.out.println("How many km do you want to travel?");
                    int km = Integer.parseInt(scanner.nextLine());
                    car.drive(km);
                }
                case 2 -> {
                    car.addFuel();
                }
                case 3 -> {
                    System.exit(0);
                }
            }
        }

    }
}

