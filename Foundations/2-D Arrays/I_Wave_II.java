/*
 * Problem I: Wave - II (Column Wave)
 * 
 * Given a 2D matrix of size n x m, print all elements column by column in wave form:
 * - Even columns (0, 2, ...) from top to bottom.
 * - Odd columns (1, 3, ...) from bottom to top.
 * 
 * Example:
 * Input:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Output:
 * 1 4 7 8 5 2 3 6 9
 */
import java.util.Scanner;

public class I_Wave_II {
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
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
