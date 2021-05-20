/* Delivery.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask for the dimentions and the weight of the package,
   and tell them how much it will cost to deliver it.
*/
import java.util.*;
public class Delivery {
    public static void main (String[] args)
    {
        // vars
        int weight;
        int width;
        int height;
        int length;
        int dimentions;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter the package's weight in kg: ");
        weight = sc.nextInt();
        System.out.print("Please enter the package's width in cm: ");
        width = sc.nextInt();
        System.out.print("Please enter the package's height in cm: ");
        height = sc.nextInt();
        System.out.print("Please enter the package's length in cm: ");
        length = sc.nextInt();

        dimentions = width * height * length;

        // if package is right size and weight, and telling the user their price
        if (weight < 27) {
            if (dimentions <= 100000) {
                if (weight <= 5) {
                    System.out.println("Your price is: $" + weight * 3);
                }
                else if (weight <= 12) {
                    System.out.println("Your price is: $" + weight * 3.5);
                }
                else if (weight <= 20) {
                    System.out.println("Your price is: $" + weight * 4);
                }
                else if (weight <= 27) {
                    System.out.println("Your price is: $" + weight * 4.5);
                }
            }
            else {
                System.out.println("Too large");
            }
        }
        else {
            System.out.println("Too heavy");
        }
    }
}