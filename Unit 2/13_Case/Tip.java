/* Tip.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask the user for their grade and 
   tell them how they are doing and some tips.
*/
import java.util.*;
public class Tip {
    public static void main (String[] args)
    {
        // vars 
        char choice;
        final char CHOICE1 = 'A';
        final char CHOICE2 = 'B';
        final char CHOICE3 = 'C';
        final char CHOICE4 = 'D';
        final char CHOICE5 = 'F';

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // showing question & getting user's input
        System.out.println("What grades are you getting in ICS so far ?");
        System.out.println("1)A\n2)B\n3)C\n4)D\n5)F");
        System.out.print("Please enter the letter you are getting as your grade: ");
        choice = sc.next().charAt(0);

        // showing answers
        switch (choice) {
            case 'a':
            case CHOICE1:
                System.out.println("Good Job Mate !");
                break;
            case 'b':
            case CHOICE2:
                System.out.println("You are doing alright ... a bit harder maybe ?");
                break;
            case 'c':
            case CHOICE3:
                System.out.println("You are doing OK ... Try harder please");
                break;
            case 'd':
            case CHOICE4:
                System.out.println("Not the best spot to be in. Work hard, I mean HARD ");
                break;
            case 'f':
            case CHOICE5:
                System.out.println("GET ON TOP OF YOUR WORK WOULD YOU ?? plz");
                break;
            default:
                System.out.println("404 not found :) Enter a character shown in the list");
                break;
        }
    }
}