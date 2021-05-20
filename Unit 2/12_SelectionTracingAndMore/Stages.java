/* Stages.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask the user's age and tell them what stage of life they are in.
*/
import java.util.*;
public class Stages {
    public static void main (String[] args)
    {
        // vars
        int age;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        // checking their age
        if (age < 18) {
            if (age <= 5) {
                System.out.println("Child");
            }
            else if (age <= 10) {
                System.out.println("Preteen");
            }
            else if (age <= 12) {
                System.out.println("Teen");
            }
            else if (age <= 18) {
                System.out.println("Toddler");
            }
        }
        else {
            System.out.println("Adult");
        }
    }
}