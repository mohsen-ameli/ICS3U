/* Spending.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 14th, 2021
   ===============================
   This program will take in the user's last month expenses and display
   the percentage each category had.
*/
import java.util.*;
public class Spending {
    public static void main (String[] args)
    {
        // vars
        double food;
        double clothing;
        double entertainment;
        double rent;
        double food_ex; // expenditure
        double clothing_ex;
        double entertainment_ex;
        double rent_ex;
        double total;

        // getting user's last month expense
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount spent last month on the following item: ");
        System.out.print("Food : $");
        food = sc.nextDouble();
        System.out.print("Clothing : $");
        clothing = sc.nextDouble();
        System.out.print("Entertainment : $");
        entertainment = sc.nextDouble();
        System.out.print("Rent : $");
        rent = sc.nextDouble();

        // Display the results
        total = food + clothing+ entertainment + rent;
        System.out.println("Category		Budget");

        food_ex = food / total * 100;
        System.out.printf("Food			%.2f%%\n", food_ex);
        clothing_ex = clothing / total * 100;
        System.out.printf("Clothing		%.2f%%\n", clothing_ex);
        entertainment_ex = entertainment / total * 100;
        System.out.printf("Entertainment           %.2f%%\n", entertainment_ex);
        rent_ex = rent / total * 100;
        System.out.printf("Rent			%.2f%%", rent_ex);
    }
}
