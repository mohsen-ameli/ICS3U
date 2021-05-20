/* ConvertData.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 20th, 2021
   ===============================
   This program will ask the user for a year, month and day and then 
   displays the date in a correct format.
*/
import java.util.*;
public class ConvertDate {
    public static void main (String[] args)
    {
        // vars 
        int year;
        int month;
        int day;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's input
        System.out.println("Please enter a year: ");
        year = sc.nextInt();
        System.out.println("Please enter a month");
        month = sc.nextInt();
        System.out.println("Please enter a day");
        day = sc.nextInt();

        // getting user's data and displaying the date 
        if (day < 31){
            switch (month) {
                case 1:
                    System.out.printf("January %d, %d", day, year);
                    break;
                case 2:
                    System.out.printf("February %d, %d", day, year);
                    break;
                case 3:
                    System.out.printf("March %d, %d", day, year);
                    break;
                case 4:
                    System.out.printf("April %d, %d", day, year);
                    break;
                case 5:
                    System.out.printf("May %d, %d", day, year);
                    break;
                case 6:
                    System.out.printf("June %d, %d", day, year);
                    break;
                case 7:
                    System.out.printf("July %d, %d", day, year);
                    break;
                case 8:
                    System.out.printf("August %d, %d", day, year);
                    break;
                case 9:
                    System.out.printf("Septembre  %d, %d", day, year);
                    break;
                case 10:
                    System.out.printf("October  %d, %d", day, year);
                    break;
                case 11:
                    System.out.printf("November  %d, %d", day, year);
                    break;
                case 12:
                    System.out.printf("December  %d, %d", day, year);
                    break;
                default:
                    System.out.println("Please enter a valid month");
                    break;
            }
        } else {
            System.out.println("Please enter a valid day number");
        }
    }
}