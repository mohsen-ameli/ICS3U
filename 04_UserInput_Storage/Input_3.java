/* Input_3.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will ask the user his/her name and age and output it.
*/
import java.util.*;

public class Input_3 {
    public static void main(String[] args) {
        // setting a string variable called name, and integer variable called age
        String name;
        int age;

        // setting up user's input
        Scanner sc = new Scanner(System.in);

        // asking user's name
        System.out.print("what's your name? ");
        name = sc.nextLine();

        // asking user's age
        System.out.print("what's your age? ");
        age = sc.nextInt();

        // printing results
        System.out.print("So your are " + name + " and you are " + age);
    }
}
