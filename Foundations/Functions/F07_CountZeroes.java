/* Count Zeroes in a Number
 
Example 1:
Input: 102030
Output: 3
 
Example 2:
Input: 123
Output: 0
 
*/
import java.util.Scanner;

public class F07_CountZeroes {
    public static long countZeroes(long n) {
        long cnt = 0;
        while (n > 0) {
            long digit = n % 10;
            if (digit == 0) {
                cnt++;
            } 
            n /= 10;
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long ans1 = countZeroes(n);
        System.out.print(ans1);
        sc.close();
    }
}
