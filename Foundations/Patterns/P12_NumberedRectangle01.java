/* Numbered Rectangle - 01

11111
22222
33333

*/
import java.util.Scanner;

public class P12_NumberedRectangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
                
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
