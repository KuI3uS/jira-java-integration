package main.java.com.homework;

public class EvenOddSumInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0){
                System.out.println("evenSum =" + i);
            }else {
                System.out.println("oddSum =" + i);
            }
        }
    }
}
