/**
 * Problem G: Katryoshka
 * 
 * Input:
 * Three numbers: n, m, and k (0 <= n, m, k <= 10^18).
 * // n - Eyes
 * // m - Mouths
 * // k - Bodies
 * 
 * Output:
 * Print the maximum number of Katryoshkas that can be built.
 */

import java.util.Scanner;

public class G_Katryoshka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong(); // Eyes
        long m = sc.nextLong(); // Mouths
        long k = sc.nextLong(); // Bodies
        
        long totalDolls = 0;
        
        long step1Dolls = Math.min(n, Math.min(m, k));
        
        totalDolls += step1Dolls;
        
        n -= step1Dolls;
        m -= step1Dolls;
        k -= step1Dolls;
        
        long pairsOfEyes = n / 2;

        long step2Dolls = Math.min(pairsOfEyes, k);
        
        totalDolls += step2Dolls;
        
        System.out.print(totalDolls);
        
        sc.close();
    }
}
