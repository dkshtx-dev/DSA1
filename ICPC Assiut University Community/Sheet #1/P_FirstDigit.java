/**
 * Problem P: First digit !
 * 
 * Input:
 * Only one line containing a number X (999 < X <= 9999).
 * 
 * Output:
 * Print "EVEN" if the first digit of X is even, otherwise "ODD".
 */
import java.util.Scanner;

public class P_FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            // Find the first digit
            while (x >= 10) {
                x /= 10;
            }
            if (x % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        
        sc.close();
    }
}
