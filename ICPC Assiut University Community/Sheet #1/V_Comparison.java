/**
 * Problem V: Comparison
 * 
 * Input:
 * Only one line containing A, S, B respectively.
 * S can be '<', '>', or '='.
 * 
 * Output:
 * Print "Right" if the comparison is correct, otherwise "Wrong".
 */
import java.util.Scanner;

public class V_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            boolean isRight = false;
            if (op.equals(">")) {
                isRight = a > b;
            } else if (op.equals("<")) {
                isRight = a < b;
            } else if (op.equals("=")) {
                isRight = a == b;
            }

            if (isRight) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        
        sc.close();
    }
}
