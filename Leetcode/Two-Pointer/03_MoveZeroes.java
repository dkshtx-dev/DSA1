/*
 * LeetCode #283 - Move Zeroes
 * Difficulty: Easy
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements. Do it in-place.
 *
 * Approach: Two-pointer with swap
 * - insertpos (slow): next position for a non-zero element
 * - i (fast): scans every element
 * - Swapping preserves non-zero order and naturally pushes zeroes right
 * - Time: O(n) | Space: O(1)
 */
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertpos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertpos];
                nums[insertpos] = nums[i];
                nums[i] = temp;
                insertpos++;
            }
        }
    }
}
