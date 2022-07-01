/*The problem statement
Write a program that reads a date-time pair and calculates how many hours have passed since the beginning of the year (1st January, 00:00).

Input data format
The first line contains a date-time pair in the format year-month-dayThour:minute:second.

Output data format
The line containing an integer number.*/

import java.util.Scanner;
import java.time.LocalDateTime;
import static java.time.temporal.TemporalAdjusters.firstDayOfYear;
import java.time.Duration;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        LocalDateTime date = LocalDateTime.parse(in.nextLine());
        LocalDateTime firstDay = date.toLocalDate().with(firstDayOfYear()).atStartOfDay();
        System.out.println(Duration.between(firstDay, date).abs().toHours());
    }
}
