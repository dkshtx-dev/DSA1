/*
 * Problem N: Intersection of Arrays
 * 
 * Given two integer arrays A of size N and B of size M, find and print their intersection.
 * Elements should be printed in the order they appear in the first array A.
 * Each matching element from B can only be paired once.
 * 
 * Example:
 * Input:
 * 1
 * 4
 * 2 6 1 2
 * 5
 * 1 2 3 4 2
 * Output:
 * 2 1 2
 */
import java.util.Scanner;

public class N_IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            int[] b = new int[m];
            boolean[] used = new boolean[m];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!used[j] && a[i] == b[j]) {
                        used[j] = true;
                        sb.append(a[i]).append(" ");
                        break;
                    }
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
