/* Cost.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 15th, 2021
   ===============================
   This program will take in user's height in inches and output it in cm.
*/
import java.util.*;
public class Height {
    public static void main (String[] args)
    {
        // vars
        final double INCH = 2.54;
        double user_height;
        double cm;

        // getting user's height in inches
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter your height in inches: ");
        user_height = sc.nextDouble();

        // results in cm
        cm = user_height * INCH;
        System.out.printf("Your height in centimeters is: %.2fcm", cm);
    }
}
