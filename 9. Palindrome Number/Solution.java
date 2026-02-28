class Solution {
    public int reverseInt(int num) {
        // Handle negative numbers
        // reversed will store the reversed integer
        int reversed = 0;
        while (num != 0) {
            //get the last digit
            // 54321 get 1
            // 5432 get 2 ...
            int digit = num % 10;
            // append the digit to reversed
            reversed = reversed * 10 + digit;
            // remove the last digit from num
            // 54321 / 10 = 5432,1 -> 5432
            num /= 10;
        }
        return reversed;
    }

    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        // Compare the original number with its reversed version
        return x == reverseInt(x);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = 131;
        System.out.println(solution.isPalindrome(number));
    }
}