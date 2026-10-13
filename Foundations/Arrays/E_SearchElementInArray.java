/*
 * Problem E: Search Element in Array
 * 
 * Given an array of N integers and a target value X, determine if X exists
 * in the array. Print "YES" if it exists, otherwise print "NO".
 * 
 * Example:
 * Input:
 * 5 7
 * 1 7 5 3 2
 * Output:
 * YES
 */
import java.util.Scanner;

public class E_SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long x = sc.nextLong();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            long val = sc.nextLong();
            if (val == x) {
                found = true;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
