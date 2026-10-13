/*
 * Problem Q: Count Quadraplets
 * 
 * Given an array A of length n and a target integer x,
 * count the number of index quadruplets (i, j, k, l) with 0 <= i < j < k < l < n such that:
 * A[i] - 2 * A[j] + 3 * A[k] - 4 * A[l] == x
 * 
 * Example:
 * Input:
 * 4 -2
 * 3 2 1 1
 * Output:
 * 1
 */
import java.util.Scanner;

public class Q_CountQuadraplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long x = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long val = a[i] - 2 * a[j] + 3 * a[k] - 4 * a[l];
                        if (val == x) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
