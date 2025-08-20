package main.java.com.java_Chapter_5.timeComputer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        LocalDateTime times = LocalDateTime.ofInstant(now, ZoneId.of("US/Pacific"));

        System.out.println(times);

        System.out.println(now.getEpochSecond());
    }
}
