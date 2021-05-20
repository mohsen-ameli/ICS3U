/* OutputPrintf2.java
   =================
   Author       : Mohsen Ameli
   Class        : ICS3U
   Date Created : May 5th, 2021
   ===============================
   This program will display a custom table.
*/
public class OutputPrintf2 {
    public static void main(String[] args) {
        // vars
        double number1 = 1.10;

        // printf section
        System.out.printf("Number\t\t Sqaure\n");
        System.out.printf("%.2f\t\t%.5f\n", number1, number1 * number1);
        number1 = number1 + 0.01;
        System.out.printf("%.2f\t\t%.5f\n", number1, number1 * number1);
        number1 = number1 + 0.01;
        System.out.printf("%.2f\t\t%.5f\n", number1, number1 * number1);
        number1 = number1 + 0.01;
        System.out.printf("%.2f\t\t%.5f\n", number1, number1 * number1);
        number1 = number1 + 0.01;
        System.out.printf("%.2f\t\t%.5f\n", number1, number1 * number1);
        number1 = number1 + 0.01;
        System.out.printf("%.2f\t\t%.5f", number1, number1 * number1);
    }
}
