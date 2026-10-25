/*
 * LeetCode #27 - Remove Element
 * Difficulty: Easy
 *
 * Given an integer array nums and an integer val, remove all occurrences of
 * val in nums in-place. The order of the elements may be changed. Then return
 * the number of elements in nums which are not equal to val.
 *
 * Approach: Two-pointer (slow/fast)
 * - i (slow): position to write the next valid element
 * - j (fast): scans every element
 * - Time: O(n) | Space: O(1)
 */
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
