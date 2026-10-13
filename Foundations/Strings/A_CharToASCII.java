/*
 * Problem A: Char to ASCII
 * 
 * Given a single character c, print its ASCII integer value.
 * 
 * Example:
 * Input:
 * A
 * Output:
 * 65
 */
import java.util.Scanner;

public class A_CharToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((int) ch);
        sc.close();
    }
}
