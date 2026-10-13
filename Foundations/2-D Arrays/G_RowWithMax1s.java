/*
 * Problem G: Row with max 1s
 * 
 * Given a binary matrix of size n x m (containing only 0s and 1s),
 * find the 0-based index of the first row that contains the maximum number of 1s.
 * If all elements in the entire matrix are 0, print -1.
 * 
 * Example:
 * Input:
 * 2 2
 * 0 0
 * 1 1
 * Output:
 * 1
 */
import java.util.Scanner;

public class G_RowWithMax1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();

        int maxOnes = 0;
        int bestRow = -1;

        for (int i = 0; i < n; i++) {
            int currentOnes = 0;
            for (int j = 0; j < m; j++) {
                if (sc.nextInt() == 1) {
                    currentOnes++;
                }
            }
            if (currentOnes > maxOnes) {
                maxOnes = currentOnes;
                bestRow = i;
            }
        }

        System.out.println(bestRow);
    }
}
