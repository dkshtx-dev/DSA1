/*
 * Problem F: Lexicographical Order
 * 
 * Given two words A and B consisting of lowercase letters, determine which word
 * appears first in dictionary order.
 * - Print "A" if A comes before B.
 * - Print "B" if B comes before A.
 * - Print "Equal" if A equals B.
 * 
 * Example:
 * Input:
 * apple apricot
 * Output:
 * A
 */
import java.util.Scanner;

public class F_LexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int res = a.compareTo(b);
        if (res < 0) {
            System.out.print("A");
        } else if (res == 0) {
            System.out.print("Equal");
        } else {
            System.out.print("B");
        }
    }
}
