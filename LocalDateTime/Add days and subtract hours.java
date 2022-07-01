/*Write a program that changes the given point of time: adds a certain number of days and subtracts a few hours.

Input and output date-time like this "2017-12-31T22:30".

Input data format

The single line containing date-time and two numbers: days to add and hours to subtract. Input elements are separated by spaces.

Output data format

The output must contain only a date-time in the specified format.*/

import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] s = in.nextLine().split(" ");
        
        LocalDateTime time = LocalDateTime.parse(s[0]).plusDays(Long.valueOf(s[1])).minusHours(Long.valueOf(s[2]));

        System.out.println(time);
    }
}
