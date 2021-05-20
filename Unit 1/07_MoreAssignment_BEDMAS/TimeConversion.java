/* TimeConversion.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 14th, 2021
   ===============================
   This program will take in the time in minutes from the user and display the time in this format (e.g 12:00).
*/
import java.util.*;
public class TimeConversion {
    public static void main (String[] args)
    {
        // vars
        int user_time; // the value of user's input
        int time_in_hr; 
        int time_in_minute;
        final int minutes = 60;

        // getting user's desired time
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the time in minutes: ");
        user_time = sc.nextInt();

        // calculations & results
        time_in_hr = user_time / minutes;
        time_in_minute = user_time - (time_in_hr * 60);
        System.out.printf("Time is %d:%02d", time_in_hr, time_in_minute);
    }
}
