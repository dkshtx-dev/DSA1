/*
 * LeetCode #905 - Sort Array By Parity
 * Difficulty: Easy
 *
 * Given an integer array nums, move all the even integers at the beginning
 * of the array followed by all the odd integers. Return any array that
 * satisfies this condition.
 *
 * Approach: Two-pointer with swap (partition-style)
 * - insertpos (slow): next position for an even element
 * - i (fast): scans every element
 * - Swapping even elements to the front naturally pushes odd elements right
 * - Time: O(n) | Space: O(1)
 */
class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int insertpos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[insertpos];
                nums[insertpos] = nums[i];
                nums[i] = temp;
                insertpos++;
            }
        }
        return nums;
    }
}
