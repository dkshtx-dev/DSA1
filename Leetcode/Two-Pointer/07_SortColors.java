/*
 * LeetCode #75 - Sort Colors
 * Difficulty: Medium
 *
 * Given an array nums with n objects colored red (0), white (1), or blue (2),
 * sort them in-place so that objects of the same color are adjacent, with the
 * colors in the order red, white, and blue.
 *
 * Approach: Dutch National Flag (Three-pointer)
 * - low  : boundary of the 0-region (everything before low is 0)
 * - mid  : current element under inspection
 * - high : boundary of the 2-region (everything after high is 2)
 * - Key: when swapping with high, do NOT advance mid (swapped element unseen)
 * - Time: O(n) | Space: O(1)
 */
class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // 0 belongs in the left section
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 belongs in the middle section
                mid++;
            } else { // nums[mid] == 2
                // 2 belongs in the right section
                swap(nums, mid, high);
                high--;
                // Note: Do NOT increment mid here!
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
