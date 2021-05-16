/* Energy.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 14th, 2021
   ===============================
   This program will take in mass from the user and display the energy it can produce
   and the number of light bulbs it can light.
*/
import java.util.*;
public class Energy {
    public static void main (String[] args)
    {
        // vars
        double bulbs;
        double m; // mass
        double e; // energy
        final double c = 3 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10; // speed of light

        // getting user's desired mass
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your desired mass (kg): ");
        m = sc.nextDouble();

        // Display the results
        e = m * c * c;
        System.out.printf("The energy that can be produced with the mass you provided is (Joules): %,20.3f \n", e);
        bulbs = e / 360000;
        System.out.printf("You can also light bulbs:  %20.3f", bulbs);
    }
}
