/*
 * Problem M: Find Duplicate Number
 * 
 * You are given an array of size N containing integers from 0 to N - 2.
 * Each integer from 0 to N - 2 is present at least once, and exactly one
 * integer is duplicated (present twice). Find and print the duplicate integer.
 * 
 * Example:
 * Input:
 * 1
 * 9
 * 0 7 2 5 4 7 1 3 6
 * Output:
 * 7
 */
import java.util.Scanner;

public class M_FindDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            long expectedSum = (long) (n - 2) * (n - 1) / 2;
            long duplicate = sum - expectedSum;
            System.out.println(duplicate);
        }
    }
}
