package main.java.com.basics;

import java.util.ArrayList;
import java.util.List;

public class _17_wrapperClasses {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Integer a = numbers.get(0);
        Integer b = 5;
        int c = b;

        System.out.println(c);
    }




}
