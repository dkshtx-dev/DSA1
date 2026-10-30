/*
 * Problem M: Find Duplicate Number
 * 
 * You are given an array of size N containing integers from 0 to N - 2.
 * Each integer from 0 to N - 2 is present at least once, and exactly one
 * integer is duplicated (present twice). Find and print the duplicate integer.
 * 
 * Example:
 * Input:
 * 1
 * 9
 * 0 7 2 5 4 7 1 3 6
 * Output:
 * 7
 */
import java.util.Scanner;

public class M_FindDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Duplicate numbers: ");
            
            
            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        break; 
                }
            }
            System.out.println();
        }
    }
}