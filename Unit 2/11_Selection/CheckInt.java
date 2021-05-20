/* CheckInt.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will prompt the user for a number then check to see whether it is positive or negative
    even or odd, and if it's a multiple of 7 or not.
.
*/
import java.util.*;
public class CheckInt {
    public static void main (String[] args)
    {
        // vars
        int num;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's value
        System.out.print("Please enter a number: ");
        num = sc.nextInt();

        // if the number is positive or not
        if (num >= 0)
        {
            System.out.println("(" + num + ")" + "Your number is positive");
        }
        else
        {
            System.out.println("(" + num + ")" + "Your number is negative");
        }
        // if the number is even or not
        if (num % 2 == 0)
        {
            System.out.println("(" + num + ")" + "Your number is even");
        }
        else
        {
            System.out.println("(" + num + ")" + "Your number is odd");
        }
        // if the number is a multiple of 7 or not
        if (num % 7 == 0)
        {
            System.out.println("(" + num + ")" + "Your number is a multiple of 7");
        }
        else
        {
            System.out.println("(" + num + ")" + "Your number is NOT a multiple of 7");
        }
    }
}