package main.java.com.object_oriented_programming.carProduct;

public class Main {
    public static void main(String[] args) {
        Car print = new Car("Ford", "focus", 2024 , "niebieski");

        System.out.println(print.make + " " + print.model + " " + print.year + " " + print.color);

        Car car = new Car("Opel", "Astra","Biały");
        System.out.println(car.make + " " + car.model + " " + car.year + " " + car.color);

    }
}

