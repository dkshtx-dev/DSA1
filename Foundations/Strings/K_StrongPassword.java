/*
 * Problem K: Strong Password
 * 
 * Given a password string S, check whether it is strong:
 * - Exactly 10 characters long
 * - Contains at least one lowercase English letter
 * - Contains at least one uppercase English letter
 * - Contains at least one digit
 * - Contains at least one special character
 * 
 * Print "Strong" if all conditions are met, otherwise "Weak".
 * 
 * Example:
 * Input:
 * Abcdef1@23
 * Output:
 * Strong
 */
import java.util.Scanner;

public class K_StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lower = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper = true;
            } else if (ch >= '0' && ch <= '9') {
                digit = true;
            } else {
                special = true;
            }
        }
        if (n == 10 && lower && upper && digit && special) {
            System.out.print("Strong");
        } else {
            System.out.print("Weak");
        }
    }
}
