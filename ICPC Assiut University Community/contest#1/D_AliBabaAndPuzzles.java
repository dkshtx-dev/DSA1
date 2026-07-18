/**
 * Problem D: Ali Baba and Puzzles
 * 
 * Input:
 * Four numbers: a, b, c, and d (-10^9 <= a, b, c <= 10^9, -10^18 <= d <= 10^18).
 * 
 * Output:
 * Print "YES" if it's possible to get d using different operators (+, -, *), otherwise print "NO".
 */

import java.util.Scanner;

public class D_AliBabaAndPuzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong(); 
        long d = sc.nextLong();
        
        if (a + b - c == d) {
            System.out.print("YES");
        } else if (a + b * c == d) {
            System.out.print("YES");
        } else if (a - b + c == d) {
            System.out.print("YES");
        } else if (a - b * c == d) {
            System.out.print("YES");
        } else if (a * b + c == d) {
            System.out.print("YES");
        } else if (a * b - c == d) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
        sc.close();
    }
}
