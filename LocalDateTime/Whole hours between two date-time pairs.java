/*The problem statement
Write a program that calculates how many whole hours are between the two date-time pairs of the same year.

Input data format
Two lines containing a date-time in a year-month-dayThour:minute format (without seconds and nanoseconds).

Output data format
The line containing an integer non-negative number.*/

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.Duration;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime end = LocalDateTime.parse(scanner.nextLine());
        
        System.out.println(Duration.between(start, end).toHours()); 
    }
}
