/**
 * Problem R: Age in Days
 * 
 * Input:
 * Only one line containing a number N (0 <= N <= 10^6).
 * 
 * Output:
 * Print the age in years, months, and days format.
 */
import java.util.Scanner;

public class R_AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
            int n = sc.nextInt();
            int years = n / 365;
            int rem = n % 365;
            int months = rem / 30;
            int days = rem % 30;

            System.out.println(years + " years");
            System.out.println(months + " months");
            System.out.println(days + " days");
        
        sc.close();
    }
}
