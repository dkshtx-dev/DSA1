/**
 * Problem B: Basic Data Types
 * 
 * Input:
 * Space-separated variables: int, long, char, float, and double.
 * Example: 3 12345678912345 a 334.23 14058.263
 * 
 * Output:
 * Print each value on a new line.
 * Example:
 * 3
 * 12345678912345
 * a
 * 334.23
 * 14058.263
 */
import java.util.Scanner;

public class B_BasicDataTypes
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        char ch = sc.next().charAt(0);
        float l = sc.nextFloat();
        double d = sc.nextDouble();
        
        System.out.println(n);
        System.out.println(m);
        System.out.println(ch);
        System.out.println(l);
        System.out.println(d);
    }
}
