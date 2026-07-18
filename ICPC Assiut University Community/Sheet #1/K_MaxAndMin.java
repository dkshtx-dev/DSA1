/**
 * Problem K: Max and Min
 * 
 * Input:
 * Three space-separated integers A, B, and C.
 * Example: 1 2 3
 * 
 * Output:
 * Print the minimum number followed by the maximum number, separated by a space.
 * Example: 1 3
 */
import java.util.Scanner;

public class K_MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        long min = a;
        long max = a;
        if(b > max)
        {
            max = b;
        }
        if(b < min)
        {
            min = b;
        }
        if(c > max)
        {
            max = c;
        }
        if(c < min)
        {
            min = c;
        }
        System.out.print(min +" "+ max);
        sc.close();
    }
}
