/**
 * Problem X: Two intervals
 * 
 * Input:
 * Only one line containing two intervals: l1, r1, l2, r2.
 * 
 * Output:
 * If there is an intersection, print its start and end boundaries.
 * Otherwise, print -1.
 */
import java.util.Scanner;

public class X_TwoIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long l1 = sc.nextLong();
            long r1 = sc.nextLong();
            long l2 = sc.nextLong();
            long r2 = sc.nextLong();

            long intersectionStart = Math.max(l1, l2);
            long intersectionEnd = Math.min(r1, r2);

            if (intersectionStart <= intersectionEnd) {
                System.out.println(intersectionStart + " " + intersectionEnd);
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
