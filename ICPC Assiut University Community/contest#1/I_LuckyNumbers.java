/**
 * Problem I: Lucky Numbers
 * 
 * Input:
 * A two-digit number N (10 <= N <= 99).
 * 
 * Output:
 * Print "YES" if one of the digits divides the other, otherwise print "NO".
 */

import java.util.Scanner;

public class I_LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = n / 10;
        int b = n % 10;

        if ((b != 0 && a % b == 0) || (a != 0 && b % a == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
