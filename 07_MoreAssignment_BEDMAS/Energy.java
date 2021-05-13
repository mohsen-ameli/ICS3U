/* Energy.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 5th, 2021
   ===============================
   This program will display two names and their bank balance using printf.
*/
public class Energy {
    public static void main (String[] args)
    {
        // vars
        String Juanita          = "Juanita";
        String Juan             = "Juan";
        double juanita_balance  = 2345678.99;
        double juan_balance     = 15455.26;

        // printf
        System.out.printf("%s's bank account balance is $%,.2f \n", Juanita, juanita_balance);
        System.out.printf("\t%s's bank account balance is $%,.2f", Juan, juan_balance);
    }
}
