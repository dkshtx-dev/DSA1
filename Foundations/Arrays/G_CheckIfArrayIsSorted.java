/*
 * Problem G: Check If Array is Sorted
 * 
 * Given an array of N integers, check whether it is sorted in non-decreasing
 * order (A[i] <= A[i+1] for all valid adjacent indices).
 * Print "YES" if sorted, otherwise print "NO".
 * 
 * Example:
 * Input:
 * 5
 * 1 2 3 4 5
 * Output:
 * YES
 */
import java.util.Scanner;

public class G_CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
