/* Input_4.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will ask the user 2 words and input them in different lines
   and then in one line.
*/
import java.util.*;

public class Input_4 {
    public static void main(String[] args) {
        // setting 2 string variables for two words
        String word1;
        String word2;

        // setting up user's input
        Scanner sc = new Scanner(System.in);

        // asking user's first word
        System.out.print("Please enter word #1: ");
        word1 = sc.nextLine();

        // asking user's second word
        System.out.print("Please enter word #2: ");
        word2 = sc.nextLine();

        // printing results
        System.out.println(word1);
        System.out.println(word2);
        System.out.print(word1 + "\t" + word2);
    }
}
