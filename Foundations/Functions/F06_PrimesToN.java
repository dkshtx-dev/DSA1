/* Print Prime Numbers Up to N

Example 1:
Input: 10
Output: 2 3 5 7 

Example 2:
Input: 5
Output: 2 3 5 

*/
import java.util.Scanner;

public class F06_PrimesToN {
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
        
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
