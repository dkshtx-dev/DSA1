/**
 * Problem T: Sort Numbers
 * 
 * Input:
 * Only one line containing three numbers A, B, C.
 * 
 * Output:
 * Print the values in ascending order, followed by a blank line,
 * and then the values in their original order.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        
        int x = a, y = b, z = c;

       
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println();

        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}