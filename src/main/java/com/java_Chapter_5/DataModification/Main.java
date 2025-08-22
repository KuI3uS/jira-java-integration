package main.java.com.java_Chapter_5.DataModification;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate next = today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(next);
    }
}
