/*
 * Problem B: ASCII to Character
 * 
 * Given an integer representing the ASCII value of a character,
 * print the corresponding character.
 * 
 * Example:
 * Input:
 * 65
 * Output:
 * A
 */
import java.util.Scanner;

public class B_ASCIIToCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println((char) val);
        sc.close();
    }
}
