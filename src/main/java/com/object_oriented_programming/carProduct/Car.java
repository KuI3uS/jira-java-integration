package main.java.com.object_oriented_programming.carProduct;

public class Car {
    public String make;
    public String model;
    public int year;
    public String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(String make, String model, String color) {
        this(make, model,2023, color);
    }
}
