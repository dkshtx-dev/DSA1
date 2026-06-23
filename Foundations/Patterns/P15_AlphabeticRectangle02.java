/* Alphabetic Rectangle - 02

Input: 3 5
Output:
ABCDE
ABCDE
ABCDE

*/
import java.util.Scanner;

public class P15_AlphabeticRectangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= m; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
