
class Solution{
    /// Given a roman numeral, convert it to an integer.
    /// Input is guaranteed to be within the range from 1 to 3999.
    // Fast char-based lookup; no Map needed (lower allocations, faster)
    /// The following roman numerals are defined:
    /// I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
    /// The numeral system is based on the following rules:
    /// 1. The value of a numeral is the sum of the values of its symbols.
    /// 2. If a smaller numeral appears before a larger numeral, it is subtracted from the larger numeral.
    /// 3. If a smaller numeral appears after a larger numeral, it is added to the larger numeral.
    /// 4. The numeral system is not case-sensitive.
    /// 5. The numeral system is not limited to the range from 1 to 3999.
    private static int valueOf(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
        }
    }

    // Example of this code: 
    // s = "IV", i = 0, then c = "I", next = "V"
    // map.get(c) = 1, map.get(next) = 5
    // since 1 < 5, return -1 + romanToInt("V") = -1 + 5 = 4

    public int romanToInt(String s){
        if (s == null || s.isEmpty()) return 0;
        s = s.toUpperCase();
        int sum = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int v = valueOf(s.charAt(i));
            if (v < prev) sum -= v;
            else { sum += v; prev = v; }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String roman = "MCMXCIV"; // Example input
        int result = solution.romanToInt(roman);
        System.out.println("The integer value of the Roman numeral " + roman + " is: " + result);
    }
}