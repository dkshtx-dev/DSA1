/*
 * Problem I: Reverse (In-Place)
 * 
 * Given an array of N integers, reverse its elements in-place (modifying the same array)
 * and then print the resulting array separated by spaces.
 * 
 * Example:
 * Input:
 * 5
 * 1 3 7 9 10
 * Output:
 * 10 9 7 3 1
 */
import java.util.Scanner;

public class I_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // In-place reversal using two pointers
        int left = 0, right = n - 1;
        while (left < right) {
            long temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(i == n - 1 ? "" : " ");
        }
        System.out.println(sb.toString());
    }
}
