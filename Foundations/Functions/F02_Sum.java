/* Sum of Numbers

Inputs: Three integers (a, b, c)
Outputs: Sum of first two (a + b), and Sum of all three (a + b + c)

Example 1:
Input: 3 5 7
Output: 8 15
Explanation: 
- sum1(3, 5) = 8
- sum2(3, 5, 7) = 15

Example 2:
Input: 10 20 30
Output: 30 60
Explanation:
- sum1(10, 20) = 30
- sum2(10, 20, 30) = 60

*/
import java.util.Scanner;

public class F02_Sum {
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
