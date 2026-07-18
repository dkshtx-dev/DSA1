/**
 * Problem M: Capital or Small or Digit
 * 
 * Input:
 * Only one line containing a character X.
 * 
 * Output:
 * Print "IS DIGIT" if X is a digit.
 * Otherwise, print "ALPHA" and in the next line print "IS CAPITAL" or "IS SMALL".
 */
import java.util.Scanner;

public class M_CapitalOrSmallOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);

        if (x >= '0' && x <= '9') {
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");

            if (x >= 'A' && x <= 'Z') {
                System.out.println("IS CAPITAL");
            } else {
                System.out.println("IS SMALL");
            }
        }
    }
}