/*
 * Problem E: Brothers
 * 
 * Given two names, each containing a first name and a last name (s1 t1 and s2 t2),
 * determine if they are brothers. They are brothers if and only if their last
 * names are identical. Print "YES" or "NO".
 * 
 * Example:
 * Input:
 * Ali Hassan
 * Omar Hassan
 * Output:
 * YES
 */
import java.util.Scanner;

public class E_Brothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String t1 = sc.next();
        String s2 = sc.next();
        String t2 = sc.next();
        if (t1.equals(t2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
