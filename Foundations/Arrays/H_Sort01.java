/*
 * Problem H: Sort 01
 * 
 * You are given an array of size N containing only 0s and 1s across T test cases.
 * Sort the array in non-decreasing order (all 0s followed by all 1s) and print it.
 * 
 * Example:
 * Input:
 * 1
 * 7
 * 0 1 1 0 1 0 1
 * Output:
 * 0 0 0 1 1 1 1
 */
import java.util.Scanner;

public class H_Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count0 = 0;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == 0) {
                    count0++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i < count0) {
                    sb.append("0 ");
                } else {
                    sb.append("1 ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
