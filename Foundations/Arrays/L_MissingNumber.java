/*
 * Problem L: Missing Number
 * 
 * Given an array of size n (where n = 2m + 1), exactly m numbers appear twice
 * and exactly one unique number appears once. Find and return this unique number.
 * 
 * Optimal Approach: Use XOR (a ^ a = 0, a ^ 0 = a) in O(n) time and O(1) space.
 * 
 * Example:
 * Input:
 * 1
 * 7
 * 2 3 1 6 3 6 2
 * Output:
 * 1
 */
import java.util.Scanner;

public class L_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int unique = 0;
            for (int i = 0; i < n; i++) {
                unique ^= sc.nextInt();
            }
            System.out.println(unique);
        }
    }
}
