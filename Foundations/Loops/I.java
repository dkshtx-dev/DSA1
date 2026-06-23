// I. Factorial
import java.util.*;

public class I {

    static long factorial(long n) {
        long fact = 1;

        for (long i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(factorial(n));
    }
}
