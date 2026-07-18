/* Print Factors of a Number (II) - Descending Order
 
Example 1:
Input: 6
Output: 6 3 2 1 
 
Example 2:
Input: 10
Output: 10 5 2 1 
 
*/
import java.util.Scanner;

public class F08_PrintFactorsII {
    public static void printFactors(int n) {
        for (int i = n; i >= 1; i--) {
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
