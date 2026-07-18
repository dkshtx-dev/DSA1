/**
 * Problem J: Multiples
 * 
 * Input:
 * Two space-separated integers A and B.
 * Example: 9 3
 * 
 * Output:
 * Print "Multiples" if A is a multiple of B or vice-versa, otherwise print "No Multiples".
 * Example: Multiples
 */
import java.util.Scanner;

public class J_Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        if (A % B == 0 || B % A == 0) {
            System.out.print("Multiples");
        } else {
            System.out.print("No Multiples");
        }
    }
}
