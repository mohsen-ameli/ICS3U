/* Pass.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will show a math problem and ask the user for a value, and if it's true
   it'll show as "correct" and if not it'll show as "incorrect".
*/
import java.util.*;
public class Pass {
    public static void main (String[] args)
    {
        // vars
        int answer1;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // math problem
        System.out.print("19 + 21 = ");
        answer1 = sc.nextInt();

        // if the answer is correct or not check
        if (answer1 == 40)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }
    }
}