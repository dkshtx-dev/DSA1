/* Function Overloading (Sum of 2 and 3 numbers)

Example 1:
Input: 5 10 15
Output: 15 30

Example 2:
Input: 1 2 3
Output: 3 6

*/
import java.util.Scanner;

public class F02_SumOverloading {
    public static int sum1(int a, int b) {
        return a + b;
    }
    
    public static int sum2(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int ans1 = sum1(a, b);
        int ans2 = sum2(a, b, c);
        
        System.out.print(ans1 + " " + ans2);
    }
}
