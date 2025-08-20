package main.java.com.java_Chapter_5.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025,8,18);
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        Set<String> zone = ZoneId.getAvailableZoneIds();
        for (String zoneId : zone) {
            System.out.println(zoneId);
        }
    }
}
