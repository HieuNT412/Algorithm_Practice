class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            // assign the letter at index i of the word(in strs) to c for comparing
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // compare value i to the next word length
                // or compare the letter at index i value of the word
                if ( i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result); // Output: "fl"
    }
}