/*
 * Problem F: Count Occurrences
 * 
 * Given an array of N integers and a target value X, count and print
 * how many times X appears in the array.
 * 
 * Example:
 * Input:
 * 6 3
 * 1 5 2 3 7 3
 * Output:
 * 2
 */
import java.util.Scanner;

public class F_CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long x = sc.nextLong();

        int count = 0;
        for (int i = 0; i < n; i++) {
            long val = sc.nextLong();
            if (val == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
