/* Cost.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 15th, 2021
   ===============================
   This program will take in the cost of the item and number of bags the user needs
   and display the total cost.
*/
import java.util.*;
public class Cost {
    public static void main (String[] args)
    {
        // vars
        double item;
        double plastic_bag;
        final double PLASTIC_COST = 0.05;
        final double HST = 0.13;

        // getting user's desired amount of cent
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the cost of your item: ");
        item = sc.nextInt();
        System.out.print("How many plastic bags will you need ? ");
        plastic_bag = sc.nextInt();

        // display the different types of coins they can get
        System.out.println("HST (13%) for your item is: $" + item * HST);
        System.out.println("The cost of the bags are: $" + plastic_bag * PLASTIC_COST);
        System.out.println("Total will be: $" + ((item * HST + item) + plastic_bag * PLASTIC_COST));
    }
}
