/*
 * Problem N: Count Words
 * 
 * Given a string S consisting of English letters and single space delimiters,
 * count and print the total number of words in S.
 * 
 * Example:
 * Input:
 * hello world this is CP
 * Output:
 * 5
 */
import java.util.Scanner;

public class N_CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.print(count);
    }
}
