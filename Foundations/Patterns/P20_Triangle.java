/* Triangle

Input: 5
Output:
    *
   * *
  * * *
 * * * *
* * * * *

Input: 3
Output:
  *
 * *
* * *

*/
import java.util.Scanner;

public class P20_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
