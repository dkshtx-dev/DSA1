// D. Print from L to R
import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        for (int i = l; i <= r; i++) {
            System.out.print(i + " ");
        }
    }
}
