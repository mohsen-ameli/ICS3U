/* Test.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will ask for a mark and tell you if you are passing or not.
*/
import java.util.*;
public class Test {
    public static void main (String[] args)
    {
        // vars
        int mark;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter a mark: ");
        mark = sc.nextInt();

        // if the mark is in range and if they're faling or passing
        if (mark > 100) {
            System.out.println("Mark is above renge");
        }
        else if (mark < 0) {
            System.out.println("Mark is below range");
        }
        else if (mark >= 50) {
            System.out.println("You are passing");
        }
        else {
            System.out.println("You are failing");
        }
    }
}