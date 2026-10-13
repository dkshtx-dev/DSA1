/*
 * Problem K: Swap Alternate
 * 
 * Given an array of size n, swap each adjacent pair of alternate elements.
 * That is, swap A[0] with A[1], A[2] with A[3], and so on.
 * If the array size is odd, the last element remains untouched.
 * 
 * Example:
 * Input:
 * 1
 * 6
 * 9 3 6 12 4 32
 * Output:
 * 3 9 12 6 32 4
 */
import java.util.Scanner;

public class K_SwapAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            for (int i = 0; i + 1 < n; i += 2) {
                long temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(i == n - 1 ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}
