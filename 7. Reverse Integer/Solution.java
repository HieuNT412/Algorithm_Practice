
/**
 * Reverses an integer while handling overflow conditions.
 * 
 * This method reverses the digits of a given integer. If the reversed value
 * would overflow the 32-bit signed integer range (Integer.MIN_VALUE to Integer.MAX_VALUE),
 * the method returns 0.
 * 
 * Algorithm:
 * - Extracts digits from the input one at a time using modulo operation
 * - Builds the reversed number by multiplying the current result by 10 and adding the next digit
 * - Checks for overflow before each operation to prevent undefined behavior
 * 
 * Time Complexity: O(log n) where n is the input integer (number of digits)
 * Space Complexity: O(1) - only uses a constant amount of extra space
 * 
 * @param x the integer to reverse
 * @return the reversed integer, or 0 if the result would overflow the 32-bit integer range
 * 
 * Example:
 * - reverse(123) returns 321
 * - reverse(-123) returns -321
 * - reverse(120) returns 21
 * - reverse(0) returns 0
 * - reverse(2147483647) returns 0 (overflow condition)
 */
public class Solution {

    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 123;
        int result = solution.reverse(x);
        System.out.println("Reversed integer: " + result);
    }
}
