/* Change_New.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 14th, 2021
   ===============================
   This program will take in the number of cents from the user
   and display the minimum amount of coins that can be formed.
*/
import java.util.*;
public class Change_New {
    public static void main (String[] args)
    {
        // vars
        int cent;
        int Toonies;
        int Loonies;
        int Quarters;
        int Dimes;
        int Nickels;
        int Pennies;

        // getting user's desired amount of cent
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount (in cent): ");
        cent = sc.nextInt();

        // display the different types of coins they can get
        System.out.println("The minimum number of coins is: ");
        Toonies = cent / 200;
        cent = cent - (Toonies * 200);
        System.out.println("Toonies: " + Toonies);
        Loonies = cent / 100;
        cent = cent - (Loonies * 100);
        System.out.println("Loonies: " + Loonies);
        Quarters = cent / 25;
        cent = cent - (Quarters * 25);
        System.out.println("Quarters: " + Quarters);
        Dimes = cent / 10;
        cent = cent - (Dimes * 10);
        System.out.println("Dimes: " + Dimes);
        Nickels = cent / 5;
        cent = cent - (Nickels * 5);
        System.out.println("Nickels: " + Nickels);
        Pennies = cent / 1;
        cent = cent - (Pennies * 1);
        System.out.println("Pennies: " + Pennies);
    }
}
