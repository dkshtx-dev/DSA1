/*
 * Problem C: Find Maximum
 * 
 * Given an integer matrix of size n x m, find and print the maximum element
 * in the entire matrix.
 * 
 * Example:
 * Input:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Output:
 * 9
 */
import java.util.Scanner;

public class C_FindMaximum {
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
        int ans = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > ans) {
                    ans = arr[i][j];
                }
            }
        }
        System.out.print(ans);
    }
}
