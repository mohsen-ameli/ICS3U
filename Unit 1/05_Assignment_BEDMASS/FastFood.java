/* FastFood.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will ask the user how many pizzas, fries and sodas they want
   and then calculate the price.
*/
import java.util.*;

public class FastFood {
    public static void main(String[] args) {
        // setting the pizza, fries, and soda vars
        double pizza = 1.69;
        double fries = 1.09;
        double sodas = 0.99;
        double user_pizza;
        double user_fries;
        double user_sodas;
        double tip;
        double total;

        // getting user's input
        Scanner sc = new Scanner(System.in);

        // getting user's order
        System.out.print("Please enter the number of pizzas: ");
        user_pizza = sc.nextDouble();
        System.out.print("Please enter the number of fries: ");
        user_fries = sc.nextDouble();
        System.out.print("Please enter the number of sodas: ");
        user_sodas = sc.nextDouble();
        System.out.print("Please enter the amount of tip for the employees: ");
        tip = sc.nextDouble();

        // calculations
        total = user_pizza * pizza + user_fries * fries + user_sodas * sodas ;
        System.out.println("Total : " + total);
        System.out.println("HST : " + total * 0.13);
        System.out.println("Total with HST and tip : " + (total * 1.13 + tip));
    }
}