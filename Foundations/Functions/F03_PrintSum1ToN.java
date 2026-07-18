/* Print 1 to N and Sum 1 to N

Example:
Input: None (Hardcoded to 5 in main)
Output:
1 2 3 4 5 
15

*/
public class F03_PrintSum1ToN {
    public static void Print1toN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void Sum1toN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
        System.out.println();
    }

    public static void main(String[] args) {
        Print1toN(5);
        Sum1toN(5);
    }
}
