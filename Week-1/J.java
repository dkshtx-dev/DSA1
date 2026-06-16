// J. xⁿ (Power)
import java.util.*;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long n = sc.nextLong();

        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        System.out.println(result);
    }
}
