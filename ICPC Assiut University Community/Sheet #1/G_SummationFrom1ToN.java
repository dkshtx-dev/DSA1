/**
 * Problem G: Summation from 1 to N
 * 
 * Input:
 * An integer N.
 * Example: 3
 * 
 * Output:
 * Print the sum of numbers from 1 to N.
 * Example: 6 (since 1 + 2 + 3 = 6)
 */
import java.util.Scanner;

public class G_SummationFrom1ToN
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long sum = n * (n + 1) / 2;
        
        System.out.print(sum);
    }
}
