/**
 * Problem H: Data Type Guessing
 * 
 * Input:
 * Three numbers: n, k, and a (1 <= n, k, a <= 10^9).
 * 
 * Output:
 * Print the appropriate data type ("int", "long long", or "double") for the result of (n * k) / a.
 */

import java.util.Scanner;

public class H_DataTypeGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();
        
        if ((n * k) % a != 0) {
            System.out.print("double");
        } else {
            long result = (n * k) / a;
            
            if (result <= 2147483647) {
                System.out.print("int");
            } else {
                System.out.print("long long");
            }
        }
        
        sc.close();
    }
}
