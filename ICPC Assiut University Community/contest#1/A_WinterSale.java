/**
 * Problem A: Winter Sale
 * 
 * Input:
 * Two numbers: X and P (1 <= X <= 99, 1 <= P <= 4 * 10^4).
 * // DP - Discount Percentage
 * // PAD- Price After Discount
 * 
 * Output:
 * Print the price of the T-shirt before the discount, rounded to two decimal places.
 * // AP - Actual Price
 */

import java.util.Scanner;

public class A_WinterSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double DP = sc.nextDouble();
        double PAD = sc.nextDouble();
        
        double AP = PAD / (1 - (DP / 100));
        System.out.printf("%.2f\n", AP);
        
        sc.close();
    }
}
