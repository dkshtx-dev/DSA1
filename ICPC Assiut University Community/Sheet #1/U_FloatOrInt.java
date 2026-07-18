/**
 * Problem U: Float or int
 * 
 * Input:
 * Only one line containing a number N (1 <= N <= 10^3).
 * 
 * Output:
 * If N is an integer, print "int [integerPart]".
 * If N is a float, print "float [integerPart] [decimalPart]".
 */
import java.util.Scanner;
import java.math.BigDecimal;

public class U_FloatOrInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String input = sc.next();
            BigDecimal bd = new BigDecimal(input);
            BigDecimal intPart = new BigDecimal(bd.toBigInteger());
            BigDecimal decPart = bd.subtract(intPart);

            if (decPart.compareTo(BigDecimal.ZERO) == 0) {
                System.out.println("int " + intPart.toBigInteger());
            } else {
                System.out.println("float " + intPart.toBigInteger() + " " + decPart.stripTrailingZeros().toPlainString());
            }
        }
        sc.close();
    }
}
