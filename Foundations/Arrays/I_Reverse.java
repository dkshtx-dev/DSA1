/*
 * Problem I: Reverse (In-Place)
 * 
 * Given an array of N integers, reverse its elements in-place (modifying the same array)
 * and then print the resulting array separated by spaces.
 * 
 * Example:
 * Input:
 * 5
 * 1 3 7 9 10
 * Output:
 * 10 9 7 3 1
 */
import java.util.Scanner;

public class I_Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
