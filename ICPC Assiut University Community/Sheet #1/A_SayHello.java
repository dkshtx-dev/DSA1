/**
 * Problem A: Say Hello With C++
 * 
 * Input:
 * A string S (name).
 * Example: programmer
 * 
 * Output:
 * Print "Hello, " followed by S.
 * Example: Hello, programmer
 */
import java.util.Scanner;

public class A_SayHello
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print("Hello, " + s);
    }
}
