/*
 * LeetCode #344 - Reverse String
 * Difficulty: Easy
 *
 * Write a function that reverses a character array s in-place.
 * Do not allocate extra space for another array.
 *
 * Approach: Two-pointer (left/right)
 * - left starts at the beginning, right at the end
 * - Swap s[left] and s[right], then converge inward
 * - Stop when pointers meet or cross
 * - Time: O(n) | Space: O(1)
 */
class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
