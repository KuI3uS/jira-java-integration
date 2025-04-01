package main.java.com.homework;

public class Homework07 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        if (a > b && a > c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }else if (a < b && c < b) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }else if (a < c && b < c){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
