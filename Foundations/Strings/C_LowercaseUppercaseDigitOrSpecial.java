/*
 * Problem C: Lowercase, Uppercase, Digit or Special
 * 
 * Given a single character, determine and print whether it is:
 * - "Lowercase"
 * - "Uppercase"
 * - "Digit"
 * - "Special"
 * 
 * Example:
 * Input:
 * a
 * Output:
 * Lowercase
 */
import java.util.Scanner;

public class C_LowercaseUppercaseDigitOrSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 97 && ch <= 122) {
            System.out.println("Lowercase");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("Uppercase");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special");
        }
    }
}
