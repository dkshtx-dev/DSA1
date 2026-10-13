/*
 * Problem F: Column Sum
 * 
 * Given an integer matrix of size n x m, compute the sum of each column
 * and print the m sums separated by spaces.
 * 
 * Example:
 * Input:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Output:
 * 12 15 18
 */
import java.util.Scanner;

public class F_ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] colSum = new long[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                colSum[j] += sc.nextLong();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < m; j++) {
            sb.append(colSum[j]).append(j == m - 1 ? "" : " ");
        }
        System.out.println(sb.toString());
    }
}
