/*
 * Problem B: Sum of Array
 * 
 * Given an array of N integers, calculate and print the sum of all elements.
 * Note: Use a 64-bit integer (long) to prevent overflow.
 * 
 * Example:
 * Input:
 * 5
 * 1 2 3 4 5
 * Output:
 * 15
 */
import java.util.Scanner;

public class B_SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextLong();
        }
        System.out.println(sum);
    }
}
