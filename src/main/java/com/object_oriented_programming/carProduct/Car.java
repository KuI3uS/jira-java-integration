package main.java.com.object_oriented_programming.carProduct;

public class Car {
    public final String make;
    public final String model;
    public final int year;
    public String color;
    public int mileage;
    public int maxSpeed;
    public int range;
    public final int maxRange;

    public Car(String make, String model, int year, String color, int maxSpeed, int range) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.maxRange = range;
    }

    public String getMake() {
        return make;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


    public String getModel() {
        return model;
    }
    public void drive(int distance){
        if (distance > range){
            System.out.println("Not enough range to drive " + distance + " km.");
        } else {
            mileage += distance;
            range -= distance;
            System.out.println("You drove " + distance + " km. Remaining range: " + range);
        }
    }
    public void addFuel(){
        range = maxRange;
        System.out.println("Range restored to max: " + maxRange);
    }
}
