/**
 * Problem Z: Hard Compare
 * 
 * Input:
 * Only one line containing four numbers A, B, C, D (1 <= A, C <= 10^7, 1 <= B, D <= 10^12).
 * 
 * Output:
 * Print "YES" if A^B > C^D, otherwise print "NO".
 */
import java.util.Scanner;

public class Z_HardCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();

            // Compare A^B > C^D using logs: B * ln(A) > D * ln(C)
            if (b * Math.log(a) > d * Math.log(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        
        sc.close();
    }
}
