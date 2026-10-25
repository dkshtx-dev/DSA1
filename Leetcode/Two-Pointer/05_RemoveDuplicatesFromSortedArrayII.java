/*
 * LeetCode #80 - Remove Duplicates from Sorted Array II
 * Difficulty: Medium
 *
 * Given an integer array nums sorted in non-decreasing order, remove some
 * duplicates in-place such that each unique element appears at most twice.
 * Return the number of elements in the modified array.
 *
 * Approach: Two-pointer (slow/fast) with at-most-k generalization
 * - i (slow/write): next write position, starts at 2
 * - j (fast/read): scans from index 2 onward
 * - Key insight: nums[j] != nums[i-2] means the element can be safely placed
 *   (at most 2 copies of it have been written so far)
 * - Time: O(n) | Space: O(1)
 */
class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int i = 2;

        for (int j = 2; j < n; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
