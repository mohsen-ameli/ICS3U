/* Quiz.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask the user for an answer to a common question.
*/
import java.util.*;
public class Quiz {
    public static void main (String[] args)
    {
        // vars 
        int choice;
        final int CHOICE1 = 1;
        final int CHOICE2 = 2;
        final int CHOICE3 = 3;
        final int CHOICE4 = 4;
        final int CHOICE5 = 5;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // showing question & getting user's input
        System.out.println("Which of these is the best programming language ?");
        System.out.println("(1)Python\n(2)JavaScript\n(3)C\n(4)Java\n(5)php");
        System.out.print("Please enter your answer: ");
        choice = sc.nextInt();

        // showing answers
        switch (choice) {
            case CHOICE1:
                System.out.println("YOU ARE CORRECT !!! You chose Python ! Here's a snake for ya :)");
                break;
            case CHOICE2:
                System.out.println("Meh close but not really :( You chose JS ! WoW :3");
                break;
            case CHOICE3:
                System.out.println("Close but not the answer. You chose C: ! Make some robots fly !");
                break;
            case CHOICE4:
                System.out.println("Nope not the answer, You chose Java !");
                break;
            case CHOICE5:
                System.out.println("Honestly what have you done ? You chose php ? People still use this ? seriously ??");
                break;
            default:
                System.out.println("404 not found :) Choose a number within 1-5 plz");
                break;
        }
    }
}