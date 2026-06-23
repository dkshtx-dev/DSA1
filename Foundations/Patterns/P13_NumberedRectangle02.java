/* Numbered Rectangle - 02

Input: 3 5
Output:
12345
12345
12345

*/
import java.util.Scanner;

public class P13_NumberedRectangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
