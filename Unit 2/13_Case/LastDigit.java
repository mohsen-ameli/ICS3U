/* LastDigit.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask the user for a number and then displays the number and its last
   digit in words.
*/
import java.util.*;
public class LastDigit {
    public static void main (String[] args)
    {
        // vars 
        int number;
        int choice;
        final int LASTDIGIT = 10;
        final int CHOICE0 = 0;
        final int CHOICE1 = 1;
        final int CHOICE2 = 2;
        final int CHOICE3 = 3;
        final int CHOICE4 = 4;
        final int CHOICE5 = 5;
        final int CHOICE6 = 6;
        final int CHOICE7 = 7;
        final int CHOICE8 = 8;
        final int CHOICE9 = 9;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.print("Please enter a number: ");
        number = sc.nextInt();
        choice = number % LASTDIGIT;

        // displaying the user's last digit as a string
        switch (choice) {
            case CHOICE0:
                System.out.printf("The last digit of %d is zero", number);
                break;
            case -CHOICE1:
            case CHOICE1:
                System.out.printf("The last digit of %d is one", number);
                break;
            case -CHOICE2:
            case CHOICE2:
                System.out.printf("The last digit of %d is two", number);
                break;
            case -CHOICE3:
            case CHOICE3:
                System.out.printf("The last digit of %d is three", number);
                break;
            case -CHOICE4:
            case CHOICE4:
                System.out.printf("The last digit of %d is four", number);
                break;
            case -CHOICE5:
            case CHOICE5:
                System.out.printf("The last digit of %d is five", number);
                break;
            case -CHOICE6:
            case CHOICE6:
                System.out.printf("The last digit of %d is six", number);
                break;
            case -CHOICE7:
            case CHOICE7:
                System.out.printf("The last digit of %d is seven", number);
                break;
            case -CHOICE8:
            case CHOICE8:
                System.out.printf("The last digit of %d is eight", number);
                break;
            case -CHOICE9:
            case CHOICE9:
                System.out.printf("The last digit of %d is nine", number);
                break;
            default:
                System.out.println("404 not found :)");
                break;
        }
    }
}