/* Currency.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 15th, 2021
   ===============================
   This program will ask for US money and output the equivalence in canadian dollars.
*/
import java.util.*;
public class Currency {
    public static void main (String[] args)
    {
        // vars
        double us_dollar;
        double Canadian;
        final double DIFFERENCE = 1.29;

        // getting user's input for us dollars
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the amount in USD: ");
        us_dollar = sc.nextInt();

        // showing results
        Canadian = us_dollar * DIFFERENCE;
        System.out.println("The equivalence in CAD is : $" + Canadian);
    }
}
