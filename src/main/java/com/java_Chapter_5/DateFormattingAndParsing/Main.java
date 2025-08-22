package main.java.com.java_Chapter_5.DateFormattingAndParsing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        String formatted = dateTime.format(DateTimeFormatter.ISO_DATE);
        String formatted2 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        String formatted3 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String formatted4 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(formatted);
        System.out.println(formatted2);
        System.out.println(formatted3);
        System.out.println(formatted4);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }
}
