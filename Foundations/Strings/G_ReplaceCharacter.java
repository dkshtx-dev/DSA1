/*
 * Problem G: Replace Character
 * 
 * Given a string s and two characters c1 and c2, replace every occurrence
 * of c1 in string s with c2 and print the modified string.
 * 
 * Example:
 * Input:
 * abacaba a b
 * Output:
 * bbbcbbb
 */
import java.util.Scanner;

public class G_ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == c1) {
                ans.append(c2);
            } else {
                ans.append(ch);
            }
        }
        System.out.print(ans);
    }
}
