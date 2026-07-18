/**
 * Problem N: Char
 * 
 * Input:
 * Only one line containing a character X which will be a capital or small letter.
 * 
 * Output:
 * Print the converted character (lowercase to uppercase or uppercase to lowercase).
 */
import java.util.Scanner;

public class N_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println((char) (ch - 32));
        } else {
            System.out.println((char) (ch + 32));
        }

        sc.close();
    }
}