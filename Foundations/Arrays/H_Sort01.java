/*
 * Problem H: Sort 01
 * 
 * You are given an array of size N containing only 0s and 1s across T test cases.
 * Sort the array in non-decreasing order (all 0s followed by all 1s) and print it.
 * 
 * Example:
 * Input:
 * 1
 * 7
 * 0 1 1 0 1 0 1
 * Output:
 * 0 0 0 1 1 1 1
 */
import java.util.Scanner;


public class H_Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();          // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int c0 = 0, c1 = 0;

            // Step 1: Count 0s and 1s
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) c0++;
                else c1++;
            }

            // Step 2: Print c0 zeros, then c1 ones
            for (int i = 0; i < c0; i++) System.out.print("0 ");
            for (int i = 0; i < c1; i++) System.out.print("1 ");

            System.out.println();
        }
    }
}
