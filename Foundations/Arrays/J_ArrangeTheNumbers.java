/*
 * Problem J: Arrange the Numbers
 * 
 * Given an integer n, construct an array of length n containing numbers 1 to n such that:
 * - Odd numbers (1, 3, 5, ...) are placed in increasing order from the start (left).
 * - Even numbers (2, 4, 6, ...) are placed in decreasing order towards the end (right).
 * 
 * Example:
 * Input:
 * 1
 * 5
 * Output:
 * 1 3 5 4 2
 */
import java.util.Scanner;

public class J_ArrangeTheNumbers
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0)
        {
            int n = sc.nextInt();
            int [] arr =  new int[n];
            int left = 0;
            int right = arr.length - 1;
             
            int val = 1;
            while(left <= right)
            {
                if(val % 2 != 0)
                {
                    arr[left++] = val++;
                }
                else{
                    arr[right--] = val++;
                }
            }
            
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
    }
}
