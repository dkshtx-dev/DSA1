/*
 * Problem M: Palindrome
 * 
 * Given a string S consisting of lowercase English letters,
 * determine whether S is a palindrome (reads the same forwards and backwards).
 * Print "YES" if it is a palindrome, otherwise "NO".
 * 
 * Example:
 * Input:
 * racecar
 * Output:
 * YES
 */
import java.util.Scanner;

public class M_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0;
        int r = s.length() - 1;
        boolean isPalindrome = true;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        if (isPalindrome) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
