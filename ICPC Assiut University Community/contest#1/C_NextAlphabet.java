/**
 * Problem C: Next Alphabet
 * 
 * Input:
 * A lowercase English letter C ('a' <= C <= 'z').
 * 
 * Output:
 * Print the next letter in the alphabet. If the input is 'z', print 'a'.
 */

import java.util.Scanner;

public class C_NextAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        if (c == 'z') {
            System.out.print('a');
        } else {
            System.out.print((char)(c + 1));
        }
        
        sc.close();
    }
}
