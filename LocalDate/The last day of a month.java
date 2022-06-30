/*We normally speak of a day by addressing a month, for example, August 30. 
Another way to indicate a day is to give an order number to each day in a year. 
Then we could say, for example, "242nd day of the year".

Write a program that reads a year and the number of a day in this year, 
and checks if the day is the last day of a month or not.

The program must output either "true" or "false".*/

import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.TemporalAdjusters;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate startDate = LocalDate.ofYearDay(year, day);
        
        System.out.println(startDate.equals(startDate.with(TemporalAdjusters.lastDayOfMonth())));
    }
}
