/* Alphabetic Rectangle - 01

Input: 3 5
Output:
AAAAA
BBBBB
CCCCC

*/
import java.util.Scanner;

public class P14_AlphabeticRectangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= m; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
