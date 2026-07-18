/**
 * Problem D: Difference
 * 
 * Input:
 * Four space-separated integers A, B, C, and D.
 * Example: 1 2 3 4
 * 
 * Output:
 * Print "Difference = " followed by the result of: (A * B) - (C * D).
 * Example: Difference = -10
 */
import java.util.Scanner;

public class D_Difference
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        
        long X = ((A*B) - (C*D));
        System.out.println("Difference = " + X);
    }
}
