/*Write a program that prints all dates of the given year with a specified offset applied.

It should read a starting date and a value of an offset (in days).

In the output, dates should be printed in ascending order with the starting date included. Do not output the dates from the next year./

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        LocalDate start = LocalDate.parse(scanner.nextLine());
        int offset = scanner.nextInt();
        LocalDate end = start.with(TemporalAdjusters.lastDayOfYear()).plusDays(1);
        start
          .datesUntil(end, Period.ofDays(offset))
            .forEach(date -> System.out.println(date));

    }
}
