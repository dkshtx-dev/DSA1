/*
 * Problem H: Wave - I (Row Wave)
 * 
 * Given a 2D matrix of size n x m, print all elements row by row in wave form:
 * - Even rows (0, 2, ...) from left to right.
 * - Odd rows (1, 3, ...) from right to left.
 * 
 * Example:
 * Input:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Output:
 * 1 2 3 6 5 4 7 8 9
 */
import java.util.Scanner;

public class H_Wave_I {
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
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
