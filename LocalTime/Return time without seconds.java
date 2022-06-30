/*Write a program that reads a point in time and outputs the same time without seconds.

Note: the input time may not contain seconds.*/

import java.time.LocalTime;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        LocalTime time = LocalTime.parse(scanner.nextLine());
        
        System.out.println(time.truncatedTo(ChronoUnit.MINUTES)); 
    }
}
