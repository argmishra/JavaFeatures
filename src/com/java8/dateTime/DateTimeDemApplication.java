package com.java8.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemApplication {

  public static void main(String[] args) {

    LocalDate date = LocalDate.now();
    System.out.println("Date : " + date);

    LocalTime time = LocalTime.now();
    System.out.println("Time : " + time);

    System.out.println("Day of Month : " + date.getDayOfMonth());
    System.out.println("Month : " + date.getMonthValue());
    System.out.println("Year : " + date.getYear());

    System.out.println("Hour : " + time.getHour());
    System.out.println("Minute : " + time.getMinute());
    System.out.println("Second : " + time.getSecond());
    System.out.println("Nano second : " + time.getNano());

    LocalDateTime localDateTime = LocalDateTime.now();

    System.out.println("Current localDateTime : " + localDateTime);
    System.out.println("Add 6 months : " + localDateTime.plusMonths(6));
    System.out.println("Before 6 months : " + localDateTime.minusMonths(6));

    localDateTime = LocalDateTime.of(1992, 04, 17, 7, 55);

    System.out.println("Custom localDateTime : " + localDateTime);

    LocalDate birthday = LocalDate.of(1992, 4, 17);
    LocalDate today = LocalDate.now();

    Period period = Period.between(birthday, today);
    System.out.println("Period : " + period.getYears());

    Year year = Year.of(2000);
    System.out.println("Is leap year : " + year.isLeap());

    ZoneId zone = ZoneId.systemDefault();
    System.out.println("Current zone : " + zone);

    zone = ZoneId.of("Asia/Kolkata");
    ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
    System.out.println("Selected zone : " + zonedDateTime);

  }
}
