/* Prime Number Check

Example 1:
Input: 7
Output: Prime

Example 2:
Input: 4
Output: Not a prime

*/
import java.util.Scanner;

public class F05_PrimeCheck {
    public static boolean isPrime(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }  
        return (cnt == 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean ans = isPrime(n);
        if (ans) {
            System.out.print("Prime");
        } else {
            System.out.print("Not a prime");
        }
    }
}
