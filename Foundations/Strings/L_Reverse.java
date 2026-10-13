/*
 * Problem L: Reverse
 * 
 * Given a string S consisting of lowercase English letters,
 * print the reversed string.
 * 
 * Example:
 * Input:
 * hello
 * Output:
 * olleh
 */
import java.util.Scanner;

public class L_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
