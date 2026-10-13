/*
 * Problem E: Row Minimum
 * 
 * Given an integer matrix of size n x m, compute the minimum element
 * of each row and print the n minimums separated by spaces.
 * 
 * Example:
 * Input:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Output:
 * 1 4 7
 */
import java.util.Scanner;

public class E_RowMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int ans = arr[i][0];
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < ans) {
                    ans = arr[i][j];
                }
            }
            System.out.print(ans + " ");
        }
    }
}
