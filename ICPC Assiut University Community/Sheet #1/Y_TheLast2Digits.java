/**
 * Problem Y: The last 2 digits
 * 
 * Input:
 * Only one line containing four numbers A, B, C, D (2 <= A, B, C, D <= 10^9).
 * 
 * Output:
 * Print the last 2 digits from their multiplication (with a leading zero if needed).
 */
import java.util.Scanner;

public class Y_TheLast2Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long a = sc.nextLong() % 100;
            long b = sc.nextLong() % 100;
            long c = sc.nextLong() % 100;
            long d = sc.nextLong() % 100;

            long res = (a * b) % 100;
            res = (res * c) % 100;
            res = (res * d) % 100;

            System.out.printf("%02d\n", res);
        }
        sc.close();
    }
}
