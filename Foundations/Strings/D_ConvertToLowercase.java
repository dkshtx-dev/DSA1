/*
 * Problem D: Convert to Lowercase
 * 
 * Given a single English alphabet character, convert it to lowercase
 * and print the resulting character.
 * 
 * Example:
 * Input:
 * F
 * Output:
 * f
 */
import java.util.Scanner;

public class D_ConvertToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32;
        }
        System.out.print(ch);
    }
}
