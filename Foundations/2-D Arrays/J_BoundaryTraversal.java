/*
 * Problem J: Boundary Traversal
 * 
 * Given a matrix of size n x m, print the boundary traversal of the matrix
 * in clockwise order starting from the top-left corner.
 * 
 * Example:
 * Input:
 * 4 4
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * Output:
 * 1 2 3 4 8 12 16 15 14 13 9 5
 */
import java.util.Scanner;

public class J_BoundaryTraversal {
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
        if (n == 1) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[0][j] + " ");
            }
            return;
        }
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0] + " ");
            }
            return;
        }
        for (int j = 0; j < m; j++) {
            System.out.print(arr[0][j] + " ");
        }
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i][m - 1] + " ");
        }
        for (int j = m - 2; j >= 0; j--) {
            System.out.print(arr[n - 1][j] + " ");
        }
        for (int i = n - 2; i >= 1; i--) {
            System.out.print(arr[i][0] + " ");
        }
    }
}
