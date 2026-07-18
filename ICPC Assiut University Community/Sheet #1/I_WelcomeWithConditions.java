/**
 * Problem I: Welcome for you with Conditions
 * 
 * Input:
 * Two space-separated integers A and B.
 * Example: 10 9
 * 
 * Output:
 * Print "Yes" if A is greater than or equal to B, otherwise print "No".
 * Example: Yes
 */
import java.util.Scanner;

public class I_WelcomeWithConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        if(n >= m)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
