/* DigitSum.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will get a 3 digit number from the user and display the sum of the digits
   and the original number.
*/
import java.util.*;
public class DigitSum {
    public static void main(String[] args) {
        // setting number, remainder vars
        int number;
        int remainder;
        int first_digit;
        int second_digit;
        int third_digit;

        // getting user's input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = sc.nextInt();

        // calculations
        first_digit = number / 100;
        remainder = number / 10;
        second_digit = remainder % 10;
        third_digit = number % 10;
        System.out.print("The number enterd is: " + number + " and the sum of its digits is: " 
            + (first_digit + second_digit + third_digit));
    }
}