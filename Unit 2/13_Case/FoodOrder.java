/* FoodOrder.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask the user for an order, and then display the proper cost for it.
*/
import java.util.*;
public class FoodOrder {
    public static void main (String[] args)
    {
        // vars 
        int choice;
        final int CHOICE1 = 1;
        final int CHOICE2 = 2;
        final int CHOICE3 = 3;
        final int CHOICE4 = 4;
        final int CHOICE5 = 5;


        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.println("(1) juice, muffin, coffee");
        System.out.println("(2) cereal, toast, milk");
        System.out.println("(3) egg, toast, coffee");
        System.out.println("(4) banana, granola, milk");
        System.out.println("(5) grapefruit, bacon, eggs, coffee");
        System.out.println();

        System.out.print("Please enter your choice: ");
        choice = sc.nextInt();

        // getting user's choice and displaying the proper cost for their order
        switch (choice) {
            case CHOICE1:
            case CHOICE2:
                System.out.println("Your order costs $2.50");
                break;
            case CHOICE3:
                System.out.println("Your order costs $3.00");
                break;
            case CHOICE4:
                System.out.println("Your order costs $3.50");
                break;
            case CHOICE5:
                System.out.println("Your order costs $5.00");
                break;
            default:
                System.out.println("Sorry but you did not enter a correct order number !");
                break;
        }
    }
}