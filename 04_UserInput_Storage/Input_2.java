/* Input_2.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will ask the user his/her name and output it.
*/
import java.util.*;

public class Input_2 {
    public static void main (String[] args)
    {
        // setting a string variable called name
        String name;

        // asking user's name
        System.out.print("what's your name? ");

        // getting the user's input
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        // printing results
        System.out.print("Hi " + name);
    }
}
