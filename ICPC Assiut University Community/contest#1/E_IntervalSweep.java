/**
 * Problem E: Interval Sweep
 * 
 * Input:
 * Two numbers: a and b (0 <= a, b <= 100).
 * // a - count of odd numbers
 * // b - count of even numbers
 * 
 * Output:
 * Print "YES" if there is a non-empty interval with exactly a odd and b even numbers, otherwise "NO".
 */

import java.util.Scanner;

public class E_IntervalSweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.print("NO");
        } else if (Math.abs(a - b) <= 1) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
        sc.close();
    }
}
