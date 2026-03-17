

public static void main(String[] args) {
    String s = "abcabcabcbb";

    for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j <= s.length(); j++) {
            String sub = s.substring(i, j);
            if (isUnique(sub)) {
                System.out.println(sub);
            }
        }
    }
}

    private static boolean isUnique(String sub) {
        java.util.HashSet<Character> seen = new java.util.HashSet<>();
        for (char c : sub.toCharArray()) {
            if (seen.contains(c)) {
                return false;
            }
            seen.add(c);
        }
        return true;
    }
