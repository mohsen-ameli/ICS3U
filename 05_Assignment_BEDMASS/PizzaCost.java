/* PizzaCost.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will ask the user the size of the pizza they are ordering, and
   the price that they'll have to pay.
*/
import java.util.*;

public class PizzaCost {
    public static void main(String[] args) {
        // setting the labour, rent, and materials vars
        double labour    = 0.75;
        double rent      = 1.0;
        double materials = 0.05;
        double price;
        int diameter;

        // asking the user's intended pizza size
        System.out.print("Please enter your intended pizza size in inches: ");

        // getting user's input
        Scanner sc = new Scanner(System.in);
        diameter = sc.nextInt();

        // showing the price of making the pizza
        price = labour + rent + materials * diameter * diameter;
        System.out.println("The price of your pizza is : $" + price);
    }
}