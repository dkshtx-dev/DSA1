// G. Count Numbers
import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int positive = 0;
        int negative = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            if (num > 0) positive++;
            if (num < 0) negative++;

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(even);
        System.out.println(odd);
    }
}
