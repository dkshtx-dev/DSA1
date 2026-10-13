/*
 * Problem O: Pair Sum
 * 
 * Given an array of size N and a target value X across T test cases,
 * count the total number of distinct index pairs (i, j) with i < j
 * such that A[i] + A[j] == X.
 * 
 * Example:
 * Input:
 * 1
 * 9
 * 1 3 6 2 5 4 3 2 4
 * 7
 * Output:
 * 7
 */
import java.util.Scanner;

public class O_PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long x = sc.nextLong();

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == x) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
