/*Write a program that reads a date from the standard input and output the following information on it:

1) number of the day in the year;

2) the number of the day in the month.*/


import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.println(date.getDayOfYear() + " " + date.getDayOfMonth());

    }
}

