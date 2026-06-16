// N. Palindrome
import java.util.*;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long original = n;
        long reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        if (original == reverse)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
