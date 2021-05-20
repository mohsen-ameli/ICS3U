/* Discriminant.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will prompt the user for 3 number and determine how many roots each have.
*/
import java.util.*;
public class Discriminant {
    public static void main (String[] args)
    {
        // vars
        int a;
        int b;
        int c;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's numbers
        System.out.print("Please enter your a value for a: ");
        a = sc.nextInt();
        System.out.print("Please enter your a value for b: ");
        b = sc.nextInt();
        System.out.print("Please enter your a value for c: ");
        c = sc.nextInt();

        // if the sales were more htan 10 or not
        if (b * b - 4 * a * c > 0)
        {
            System.out.println("Two roots");
        }
        else if (b * b - 4 * a * c < 0)
        {
            System.out.println("No roots");
        }
        else
        {
            System.out.println("one root");
        }
    }
}