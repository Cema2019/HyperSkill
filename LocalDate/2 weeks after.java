/*Write a program that reads a date from the standard input and prints a date that is 2 weeks after.*/

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scan.nextLine());
        LocalDate newDate = date.plusWeeks(2);
        System.out.println(newDate);
      
    }
}
