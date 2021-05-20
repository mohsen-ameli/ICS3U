/* SortThreeNumbers.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask for 3 numbers and display them in ascending order.
*/
import java.util.*;
public class SortThreeNumbers {
    public static void main (String[] args)
    {
        // vars
        int num1;
        int num2;
        int num3;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter your first number: ");
        num1 = sc.nextInt();
        System.out.print("Please enter your second number: ");
        num2 = sc.nextInt();
        System.out.print("Please enter your third number: ");
        num3 = sc.nextInt();

        // if the number is valid or not
        if (num1 > 0 && num1 != 0 && num2 > 0 && num2 != 0 && num3 > 0 && num3 != 0) {
            if (num1 > num2 && num1 > num3) { // num1 is the biggest
                if (num2 > num3) { 
                    System.out.printf("%d < %d < %d", num3, num2, num1);
                } else {
                    System.out.printf("%d < %d < %d", num2, num3, num1);
                }
            } else if (num2 > num1 && num2 > num3) { // num2 is the biggest
                if (num1 > num3) {
                    System.out.printf("%d < %d < %d", num3, num1, num2);
                } else {
                    System.out.printf("%d < %d < %d", num1, num3, num2);
                }
            }
            else if (num3 > num1 && num3 > num2) { // num3 is the biggest
                if (num1 > num2) {
                    System.out.printf("%d < %d < %d", num2, num1, num3);
                } else {
                    System.out.printf("%d < %d < %d", num1, num2, num3);
                }
            }
        }
        else {
            System.out.println("Please enter a number above 0 and not including 0 !");
        }
    }
}