/*
 * Problem D: Search in a 2D Matrix
 * 
 * Given an integer matrix of size n x m and a target value x, determine whether
 * x exists in the matrix. Print true if found, otherwise false.
 * 
 * Example:
 * Input:
 * 3 4 7
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * Output:
 * true
 */
import java.util.Scanner;

public class D_SearchIn2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = sc.nextInt();
                //or else if(arr[i][j] == x)
                if (val == x) {
                    found = true;
                }
            }
        }
        System.out.println(found);
    }
}
