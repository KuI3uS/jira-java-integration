package main.java.com.homework;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TimeDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your date of birth");
        String data = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(data);

        LocalDate now = LocalDate.now();

        Period years = Period.between(birthday, now);

        System.out.println(years.getYears());
        System.out.println(years.getMonths());
        System.out.println(years.getDays());
    }
}
