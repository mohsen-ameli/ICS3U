/* Driving.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will ask for your age and tell you if you can drive or not.
*/
import java.util.*;
public class Driving {
    public static void main (String[] args)
    {
        // vars
        int age;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        // if you can drive or not
        if (age < 18) {
            System.out.println(age + " Too young to drive");
        }
        else if (age > 75) {
            System.out.println(age + " Sorry you are over the legal age limit for driving");
        }
        else {
            System.out.println(age + " Age OK.  Have you got a driver’s licence?");
        }
    }
}