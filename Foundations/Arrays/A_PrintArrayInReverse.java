/*
 * Problem A: Print Array In Reverse
 * 
 * Given an array of N integers, print its elements in reverse order
 * from the last element to the first element separated by spaces.
 * 
 * Example:
 * Input:
 * 5
 * 1 2 3 4 5
 * Output:
 * 5 4 3 2 1
 */
import java.util.Scanner;

public class A_PrintArrayInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i > 0 ? " " : ""));
        }
        System.out.println();
    }
}
