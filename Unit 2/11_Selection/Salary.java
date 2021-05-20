/* Salary.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 19th, 2021
   ===============================
   This program will prompt the user for the number of sales and determines 
   the total salary for that month.
*/
import java.util.*;
public class Salary {
    public static void main (String[] args)
    {
        // vars
        final int BASE_SALARY = 1000;
        int sales;
        double salary;

        // setting up the scanner
        Scanner sc = new Scanner(System.in);

        // getting user's sales
        System.out.print("Please enter your number of sales: ");
        sales = sc.nextInt();

        // if the sales were more htan 10 or not
        if (sales > 10)
        {
            salary = BASE_SALARY * ((double) sales / 100 + 1);
            System.out.println("salary: $" + salary);
        }
        else
        {
            System.out.println("Your salary is: $" + BASE_SALARY);
        }
    }
}