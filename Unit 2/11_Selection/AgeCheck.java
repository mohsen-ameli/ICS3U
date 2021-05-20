/* AgeCheck.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will ask the user's age and say how much longer until they can vote
   and if they can already vote, then it'll show OLD ENOUGH TO VOTE.
*/
import java.util.*;
public class AgeCheck {
    public static void main (String[] args)
    {
        // vars
        int age;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's age
        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        // if user is 18+ or not
        if (age >= 18)
        {
            System.out.println("OLD ENOUGH TO VOTE");
        }
        else
        {
            System.out.println(18 - age + " years left until you can vote");
        }
    }
}