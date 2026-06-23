/* Hollow Inverted Pyramid

*****
*  *
* *
**
*

*/
import java.util.Scanner;

public class P10_HollowInvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == n || i == 1 || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
