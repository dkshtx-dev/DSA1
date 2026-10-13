/*
 * Problem P: Triplets
 * 
 * Given an array of size N and a target value X across T test cases,
 * find the total number of triplets (i, j, k) with i < j < k
 * such that A[i] + A[j] + A[k] == X.
 * 
 * Example:
 * Input:
 * 1
 * 7
 * 1 2 3 4 5 6 7
 * 12
 * Output:
 * 5
 */
import java.util.Scanner;

public class P_Triplets {
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
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] + arr[k] == x) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
