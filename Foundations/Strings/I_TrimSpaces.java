/*
 * Problem I: Trim Spaces
 * 
 * Given an input string S containing words separated by spaces,
 * remove all spaces from the string and print the result.
 * 
 * Example:
 * Input:
 * abc def g hi
 * Output:
 * abcdefghi
 */
import java.util.Scanner;

public class I_TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                ans.append(ch);
            }
        }
        System.out.print(ans);
    }
}
