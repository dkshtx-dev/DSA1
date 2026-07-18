/* nCr (Binomial Coefficient)

Formula:
nCr = n! / (r! * (n - r)!)

Example:
Input: 5 2
Output: 10
Explanation: 5C2 = 5! / (2! * 3!) = 120 / (2 * 6) = 10

*/
import java.util.Scanner;

public class F01_NCR {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n - r);
        
        System.out.print(nfact / (rfact * nrfact));
    }
}
/*
import java.util.Scanner;
public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int r = sc.nextInt();

            int nfact = 1;
            for(int i=1;i<=n;i++)
            {
                fact *=1;
            }

            int rfact = 1;
            for(int i=1; i<=r;i++){
                fact*=1;
            }

            int nrfact = 1;
            for(int i=1;i<=n-r;i++)
            {
                fact*=1;
            }

            System.out.print(nfact / (rfact * nrfact));
        }
    }
}



*/