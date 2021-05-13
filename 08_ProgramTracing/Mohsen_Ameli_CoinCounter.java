/* Mohsen_Ameli_CoinCounter.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 13th, 2021
   ===============================
   This program will take in 5 different types of coins, and it will display
   the value of all the coins, and the rolls they can form, as well as the 
   leftover amounts.
*/
import java.util.*;
public class Mohsen_Ameli_CoinCounter {
    public static void main(String[] args) {
        // Coin roll max
        final int TOONIES_ROLL_MAX    = 25;
        final int LOONES_ROLL_MAX     = 25;
        final int QUARTER_ROLL_MAX    = 40;
        final int DIMES_ROLL_MAX      = 50;
        final int NICKEL_ROLL_MAX     = 40;
        // Different types of coin
        int Toonies;
        int Loonies;
        int Quarters;
        int Dimes;
        int Nickels;
        // Coin roll count
        int Toonies_roll;
        int Loonies_roll;
        int Quarters_roll;
        int Dimes_roll;
        int Nickels_roll;
        // Coin values
        double Toonies_value;
        double Loonies_value;
        double Quarters_value;
        double Dimes_value;
        double Nickels_value;
        // Coin leftover
        int Toonies_left;
        int Loonies_left;
        int Quarters_left;
        int Dimes_left;
        int Nickels_left;
        // Coin leftover values
        double Toonies_left_val;
        double Loonies_left_val;
        double Quarters_left_val;
        double Dimes_left_val;
        double Nickels_left_val;
        // Coin total value
        double coin_total_val;
        double total_coin_left_val;
        
        // Title
        System.out.println("|| $$$ \\\\\\ ==========  \"COIN DEPOSIT\" ========== /// $$$ ||");
        System.out.println(" ");

        // Setting up scanner
        Scanner sc = new Scanner(System.in);

        // Scanning user input
        System.out.println("Please enter how many coins you have of each type:");
        System.out.print("Toonies: ");
        Toonies     = sc.nextInt();
        System.out.print("Loonies: ");
        Loonies     = sc.nextInt();
        System.out.print("Quarters: ");
        Quarters    = sc.nextInt();
        System.out.print("Dimes: ");
        Dimes       = sc.nextInt();
        System.out.print("Nickels: ");
        Nickels     = sc.nextInt();
        System.out.println(" ");

        // Second Title
        System.out.println("Coins wrapped                 Value");
        System.out.println("=========================     =======");

        // Coins wrapped and their value
        Toonies_roll    = Toonies / TOONIES_ROLL_MAX; // Toonies
        Toonies_value   = Toonies_roll * 50;
        System.out.printf("%2d roll (s) of Toonies        $%6.2f\n", Toonies_roll, Toonies_value);

        Loonies_roll    = Loonies / LOONES_ROLL_MAX; // Loonies
        Loonies_value   = Loonies_roll * 25;
        System.out.printf("%2d roll (s) of Loonies        $%6.2f\n", Loonies_roll, Loonies_value);

        Quarters_roll   = Quarters / QUARTER_ROLL_MAX; // Quarters
        Quarters_value  = Quarters_roll * 10;
        System.out.printf("%2d roll (s) of Quarters       $%6.2f\n", Quarters_roll, Quarters_value);

        Dimes_roll      = Dimes / DIMES_ROLL_MAX; // Dimes
        Dimes_value     = Dimes_roll * 5;
        System.out.printf("%2d roll (s) of Dimes          $%6.2f\n", Dimes_roll, Dimes_value);

        Nickels_roll    = Nickels / NICKEL_ROLL_MAX; // Nickels
        Nickels_value   = Nickels_roll * 2;
        System.out.printf("%2d roll (s) of Nickels        $%6.2f\n", Nickels_roll, Nickels_value);
        System.out.println(" ");

        // Total value
        coin_total_val  = Toonies_value + Loonies_value + Quarters_value + Dimes_value + Nickels_value;
        System.out.printf("Your wrapped coins have a total value of $%.2f\n", coin_total_val);
        System.out.println(" ");

        // Third title
        System.out.println("Leftover coins                Value");
        System.out.println("=========================     =======");

        // Leftover coins
        Toonies_left        = Toonies - (Toonies_roll * TOONIES_ROLL_MAX);
        Toonies_left_val    = Toonies_left * 2;
        System.out.printf("%2d Toonies                    $%6.2f\n", Toonies_left, Toonies_left_val);

        Loonies_left        = Loonies - (Loonies_roll * LOONES_ROLL_MAX);
        Loonies_left_val    = Loonies_left * 1;
        System.out.printf("%2d Loonies                    $%6.2f\n", Loonies_left, Loonies_left_val);

        Quarters_left        = Quarters - (Quarters_roll * QUARTER_ROLL_MAX);
        Quarters_left_val    = Quarters_left * 0.25;
        System.out.printf("%2d Quarters                   $%6.2f\n", Quarters_left, Quarters_left_val);

        Dimes_left        = Dimes - (Dimes_roll * DIMES_ROLL_MAX);
        Dimes_left_val    = Dimes_left * 0.1;
        System.out.printf("%2d Dimes                      $%6.2f\n", Dimes_left, Dimes_left_val);

        Nickels_left        = Nickels - (Nickels_roll * NICKEL_ROLL_MAX);
        Nickels_left_val    = Nickels_left * 0.05;
        System.out.printf("%2d Nickels                    $%6.2f\n", Nickels_left, Nickels_left_val);
        System.out.println(" ");

        // Total value of leftover coins
        total_coin_left_val = Toonies_left_val + Loonies_left_val + Quarters_left_val + Dimes_left_val + Nickels_left_val;
        System.out.printf("The value of your unwrapped coins is $%.2f\n", total_coin_left_val);
        System.out.println(" ");

        // Final last words
        System.out.println("Thank you for using auto coin deposit!");
    }
}
