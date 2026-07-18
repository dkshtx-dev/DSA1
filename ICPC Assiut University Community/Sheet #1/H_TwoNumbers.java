/**
 * Problem H: Two numbers
 * 
 * Input:
 * Two space-separated integers A and B.
 * Example: 10 3
 * 
 * Output:
 * Print the floor, ceil, and round of A / B.
 * Example:
 * floor 10 / 3 = 3
 * ceil 10 / 3 = 4
 * round 10 / 3 = 3
 */
import java.util.Scanner;

public class H_TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        double result = (double) A / B;

        System.out.println("floor " + A + " / " + B + " = " + (int) Math.floor(result));
        System.out.println("ceil " + A + " / " + B + " = " + (int) Math.ceil(result));
        System.out.println("round " + A + " / " + B + " = " + Math.round(result));
    }
}
