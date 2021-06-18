package pl.sdacademy.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 6, 16);
        System.out.println(date);
        LocalDate newDate = date.plusDays(20);
        System.out.println(newDate);

        LocalTime time = LocalTime.of(12, 41);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
    //    LocalDateTime dateTime1 = LocalDateTime.of(2021, 6, 16, 12, 41);
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(date.format(formatter));

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);



    }
}
