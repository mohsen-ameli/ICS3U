/* SimpleInterestPrincipal.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 14th, 2021
   ===============================
   This program will take in user's desired numbers of years, amount of interest, and 
   the interest rate, and display how much they originally had before all those years.
*/
import java.util.*;
public class SimpleInterestPrincipal {
    public static void main (String[] args)
    {
        // vars
        double principal;
        double num_years;
        double interest_rate;
        double amount;

        // getting user's information
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the following informaiton: ");
        
        System.out.print("Amount: ");
        amount = sc.nextDouble();
        System.out.print("Number of Years: ");
        num_years = sc.nextDouble();
        System.out.print("Interest: ");
        interest_rate = sc.nextDouble();

        // Display the results
        principal = amount / (num_years * interest_rate / 100 + 1);
        // principal = amount * (1 + num_years * interest_rate);
        System.out.printf("You had $%.0f, %.0f years ago!", principal, num_years);
    }
}
