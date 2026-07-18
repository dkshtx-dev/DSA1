/**
 * Problem L: The Brothers
 * 
 * Input:
 * First line: First name F1 and Second name S1.
 * Second line: First name F2 and Second name S2.
 * Example:
 * Anas Soliman
 * Samy Soliman
 * 
 * Output:
 * Print "ARE Brothers" if they share the same second name, otherwise print "NOT".
 * Example: ARE Brothers
 */
import java.util.Scanner;

public class L_TheBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String f1 = sc.next();
        String s1 = sc.next();

        String f2 = sc.next();
        String s2 = sc.next();

        if (s1.equals(s2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
        
        sc.close();
    }
}
