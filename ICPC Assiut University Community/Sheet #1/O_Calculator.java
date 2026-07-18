/**
 * Problem O: Calculator
 * 
 * Input:
 * Only one line containing A, S, B (1 <= A, B <= 10^4), S is (+, -, *, /) without spaces.
 * 
 * Output:
 * Result of the mathematical expression (integer division for '/').
 */
import java.util.Scanner;

public class O_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        
        

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }

        sc.close();
    }
}