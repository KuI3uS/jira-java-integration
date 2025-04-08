package main.java.com.homework;

public class PrimeNumbersInRange {
    public static void main(String[] args) {

        int base = 8;
        int exponent = 2;

        int result = 1;

        for (int i = 1 ; i <= exponent; i++){
            result *= base;
        }
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
