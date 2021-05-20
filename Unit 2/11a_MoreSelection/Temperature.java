/* Temperature.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will ask for a temprature and say how hot or cold it is.
*/
import java.util.*;
public class Temperature {
    public static void main (String[] args)
    {
        // vars
        int temp;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter a temp: ");
        temp = sc.nextInt();

        // checking and seeing how the weather is 
        if (temp < -18) {
            System.out.println("Very cold");
        }
        else if (temp < 0) {
            System.out.println("Cold");
        }
        else if (temp == 0) {
            System.out.println("Freezing point of water");
        }
        else if (temp < 10) {
            System.out.println("Very cool");
        }
        else if (temp < 20) {
            System.out.println("Moderate");
        }
        else if (temp < 30) {
            System.out.println("Warm");
        }
        else if (temp < 40) {
            System.out.println("Hot");
        }
        else if (temp < 100) {
            System.out.println("Extremely hot");
        }
        else {
            System.out.println("boiling point of water");
        }
    }
}