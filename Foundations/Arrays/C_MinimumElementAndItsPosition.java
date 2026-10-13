/*
 * Problem C: Minimum Element and Its Position
 * 
 * Find the minimum value in an array of N integers and its 1-based index.
 * If the minimum value occurs multiple times, return the position of the first occurrence.
 * 
 * Example:
 * Input:
 * 6
 * 7 3 4 5 3 10
 * Output:
 * 3 2
 */
import java.util.Scanner;

public class C_MinimumElementAndItsPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long minVal = Long.MAX_VALUE;
        int minPos = -1;

        for (int i = 1; i <= n; i++) {
            long val = sc.nextLong();
            if (val < minVal) {
                minVal = val;
                minPos = i;
            }
        }
        System.out.println(minVal + " " + minPos);
    }
}
