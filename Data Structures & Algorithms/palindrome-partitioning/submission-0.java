class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        // entire string covered
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // try every possible end position from start
        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i + 1);

            // only recurse if palindrome
            if (isPalindrome(sub)) {
                current.add(sub);
                backtrack(s, i + 1, current, result); // i+1 not start+1
                current.remove(current.size() - 1); // backtrack
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
