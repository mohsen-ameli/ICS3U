/* Capital.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask for the capital of Canada and tell you if you were correct or not.
*/
import java.util.*;
public class Capital {
    public static void main (String[] args)
    {
        // vars
        String canada;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter Canada's capital: ");
        canada = sc.nextLine();

        // if the user's answer was correct or not
        if (canada.equals("Ottawa") || canada.equals("ottawa")) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect");
        }
    }
}