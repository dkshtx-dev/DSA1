/**
 * Problem C: Simple Calculator
 * 
 * Input:
 * Two space-separated numbers X and Y.
 * Example: 5 10
 * 
 * Output:
 * Print summation, multiplication, and subtraction in the specified format.
 * Example:
 * 5 + 10 = 15
 * 5 * 10 = 50
 * 5 - 10 = -5
 */
import java.util.Scanner;

public class C_SimpleCalculator
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        System.out.println(n + " + " + m + " = " + (n+m));
        System.out.println(n + " * " + m + " = " + (n*m));
        System.out.println(n + " - " + m + " = " + (n-m));
    }
}
