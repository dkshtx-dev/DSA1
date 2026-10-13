/*
 * Problem H: Remove Character
 * 
 * Given a string s and a character x, remove all occurrences of x from s
 * and print the resulting string.
 * 
 * Example:
 * Input:
 * abacaba a
 * Output:
 * bcb
 */
import java.util.Scanner;

public class H_RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char x = sc.next().charAt(0);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != x) {
                ans.append(ch);
            }
        }
        System.out.print(ans);
    }
}
