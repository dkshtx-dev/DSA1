/*
 * LeetCode #443 - String Compression
 * Difficulty: Medium
 *
 * Given an array of characters chars, compress it using the following algorithm:
 * Begin with an empty string s. For each group of consecutive repeating
 * characters in chars, append the character to s. If the group length > 1,
 * also append the group length. Modify chars in-place and return the new length.
 *
 * Approach: Two-pointer (read/write)
 * - read: scans input characters, counting consecutive repeats
 * - write: writes compressed output back into the same array
 * - Digit characters of count > 1 are written one by one via Integer.toString()
 * - Time: O(n) | Space: O(1)
 */
class StringCompression {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;
        int n = chars.length;

        while (read < n) {
            char currChar = chars[read];
            int count = 0;

            // 1. Count consecutive repeating characters
            while (read < n && chars[read] == currChar) {
                read++;
                count++;
            }

            // 2. Write the character
            chars[write++] = currChar;

            // 3. If count > 1, write its digits
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        // Return the new compressed length
        return write;
    }
}
