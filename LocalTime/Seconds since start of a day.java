/*Write a program that reads a number of seconds from the start of a day and prints the current time.

If the resulting time has zero seconds, do not output them.*/


import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        Long seconds = Long.valueOf(scanner.nextLine());
        LocalTime time = LocalTime.ofSecondOfDay(seconds);
        System.out.println(time); 
      
    }
}
