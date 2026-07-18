/* Print Factors of a Number (I)
 
Example 1:
Input: 6
Output: 1 2 3 6 
 
Example 2:
Input: 10
Output: 1 2 5 10 
 
*/
import java.util.Scanner;

public class F04_PrintFactorsI {
    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printFactors(n);
        sc.close();
    }
}
