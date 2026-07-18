/**
 * Problem W: Mathematical Expression
 * 
 * Input:
 * Only one line containing A, S, B, Q, C respectively.
 * S can be '+', '-', '*', and Q is '='.
 * 
 * Output:
 * Print "Yes" if the expression is correct, otherwise print the correct answer.
 */
import java.util.Scanner;

public class W_MathematicalExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            String eq = sc.next(); // '='
            int c = sc.nextInt();

            int expected = 0;
            if (op.equals("+")) {
                expected = a + b;
            } else if (op.equals("-")) {
                expected = a - b;
            } else if (op.equals("*")) {
                expected = a * b;
            }

            if (expected == c) {
                System.out.println("Yes");
            } else {
                System.out.println(expected);
            }
        }
        sc.close();
    }
}
