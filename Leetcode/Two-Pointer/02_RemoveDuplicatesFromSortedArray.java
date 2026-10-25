/*
 * LeetCode #26 - Remove Duplicates from Sorted Array
 * Difficulty: Easy
 *
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once.
 * Return the number of unique elements.
 *
 * Approach: Two-pointer (slow/fast)
 * - w (slow/write): last position of a confirmed unique element
 * - r (fast/read): scans for a new unique element
 * - Time: O(n) | Space: O(1)
 */
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int w = 0;

        for (int r = w + 1; r < n; r++) {
            if (nums[w] != nums[r]) {
                w++;
                nums[w] = nums[r];
            }
        }
        return w + 1;
    }
}
