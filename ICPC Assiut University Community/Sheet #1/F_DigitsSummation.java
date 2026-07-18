/**
 * Problem F: Digits Summation
 * 
 * Input:
 * Two space-separated numbers N and M.
 * Example: 13 12
 * 
 * Output:
 * Print the sum of the last digits of N and M.
 * Example: 5 (since last digit of 13 is 3, and 12 is 2; 3 + 2 = 5)
 */
import java.util.Scanner;

public class F_DigitsSummation
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long digit = n % 10;
        long digit2 = m % 10;
        
        System.out.print(digit + digit2);
    }
}
