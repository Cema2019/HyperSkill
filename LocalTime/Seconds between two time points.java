/*Implement a method that takes two instances of LocalTime and determines how many seconds are between them.*/

import java.time.LocalTime;
import java.util.Scanner;
import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        LocalTime start = LocalTime.parse(scanner.nextLine());
        LocalTime end = LocalTime.parse(scanner.nextLine());
        
        System.out.println(Math.abs(Duration.between(start, end).getSeconds()));   
    }
}
