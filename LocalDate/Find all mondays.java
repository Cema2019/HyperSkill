/*Write a program that reads a year and the number of a month (1-12) and prints the dates of all Mondays 
of this month in the correct order (from the first to the last).*/

import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.*;
import java.time.DayOfWeek;
import java.util.List;
import java.time.YearMonth;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate startDate = YearMonth.of(year, month).atDay(1);
        
        long numOfDays = startDate.lengthOfMonth();
        
        List<LocalDate> daysRange = Stream.iterate(startDate, date -> date.plusDays(1))
                                        .limit(numOfDays)
                                        .filter(date -> date.getDayOfWeek() == DayOfWeek.MONDAY)
                                        .collect(Collectors.toList());
                                        
        daysRange.stream().forEach(System.out::println);
    }
}
