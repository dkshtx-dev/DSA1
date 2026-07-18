/**
 * Problem B: Memo and Momo
 * 
 * Input:
 * Three numbers: a, b and k (1 <= a, b, k <= 10^18).
 * 
 * Output:
 * Print the result according to the division status (Both, Memo, Momo, or No One).
 */

import java.util.Scanner;

public class B_MemoAndMomo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        
        if (a % k == 0 && b % k == 0) {
            System.out.print("Both");
        } else if (a % k == 0) {
            System.out.print("Memo");
        } else if (b % k == 0) {
            System.out.print("Momo");
        } else {
            System.out.print("No One");
        }
        
        sc.close();
    }
}
