/**
 * Problem E: Area of Circle
 * 
 * Input:
 * A double R (radius of a circle).
 * Example: 2.00
 * 
 * Output:
 * Print the area of the circle (Area = PI * R * R, where PI = 3.141592653).
 * Example: 12.566370612
 */
import java.util.Scanner;

public class E_AreaOfCircle
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        
        double Area = 3.141592653 * R * R;
        
        System.out.print(Area);
    }
}
