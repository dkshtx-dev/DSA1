/*
 * Problem D: Maximum Element with Position
 * 
 * Find the maximum value in an array of N integers and its 1-based index.
 * If multiple elements have the maximum value, print the position of the first occurrence.
 * 
 * Example:
 * Input:
 * 5
 * 1 2 4 3 1
 * Output:
 * 4 3
 */
import java.util.Scanner;

public class D_MaximumElementWithPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long maxVal = Long.MIN_VALUE;
        int maxPos = -1;

        for (int i = 1; i <= n; i++) {
            long val = sc.nextLong();
            if (val > maxVal) {
                maxVal = val;
                maxPos = i;
            }
        }
        System.out.println(maxVal + " " + maxPos);
    }
}
