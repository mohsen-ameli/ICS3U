/* Average_.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 15th, 2021
   ===============================
   This program will take in 5 grades and calculate their average and show it.
*/
import java.util.*;
public class Average_ {
    public static void main (String[] args)
    {
        // vars
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        double avg;

        // getting user's desired amount of cent
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the first grade: ");
        grade1 = sc.nextInt();
        System.out.print("Please, enter the second grade:  ");
        grade2 = sc.nextInt();
        System.out.print("Please, enter the third grade: ");
        grade3 = sc.nextInt();
        System.out.print("Please, enter the forth grade:  ");
        grade4 = sc.nextInt();
        System.out.print("Please, enter the fifth grade:  ");
        grade5 = sc.nextInt();

        // display the different types of coins they can get
        avg = (double) (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        System.out.println("Average is : " + avg);
    }
}
