/* Drop.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will display the height on an object at a certain time that
   the user will decide via inputing its value.
*/
import java.util.*;
public class Drop {
    public static void main(String[] args) {
        // setting height and time vars
        double h;
        double t;

        // getting user's input
        Scanner sc = new Scanner(System.in);
        t = sc.nextDouble();

        // calculations
        h = 100 - 4.9 * t * t;
        System.out.println(h);
    }
}