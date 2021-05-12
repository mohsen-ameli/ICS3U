/* Alive.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 9th, 2021
   ===============================
   This program will display how many days you have been alive, and
   how many hours you have slept.
*/
import java.util.*;
public class Alive {
    public static void main(String[] args) {
        // setting up our vars
        int year_born;
        int month_born;
        int day_born;
        int year_today;
        int month_today;
        int day_today;

        // setting up user input
        Scanner sc = new Scanner(System.in);

        // getting user's year born
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        year_born = sc.nextInt();

        // getting user's month
        System.out.print("Month: ");
        month_born = sc.nextInt();

        // getting user's day
        System.out.print("Day: ");
        day_born = sc.nextInt();


        // getting today's date
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        year_today = sc.nextInt();

        // getting user's month
        System.out.print("Month: ");
        month_today = sc.nextInt();

        // getting user's day
        System.out.print("Day: ");
        day_today = sc.nextInt();

        // showing how many days they have been alive and how many hours they've slept for
        int b = 30 - day_born + day_today; // complete days on day born
        int c = (11 - month_born) * 30 + month_today * 30 ; // complete days on month born
        int a = (year_today - year_born - 1) * 365;
        int d = a + b + c;

        System.out.println("You have been alive for " + d + " days !" );
        System.out.print("You have slept for " + d * 8 + " hours !");
    }
}