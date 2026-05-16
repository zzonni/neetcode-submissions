class Solution {
    public boolean isPalindrome(String s) {
        // use 2 pointer left and right. left = first, right = last
        // if s[left] = s[right] => left = left + 1, right = right - 1
        // while left < right + left is not alphanumeric => left = left + 1 => skip non-alphanumeric
        // while right > left + if right is not alphanumeric => right = right - 1
        // break loop when left = right
        int n = s.length(), l = 0, r = n - 1;
        while (l < r) {
            while (l < r && !isAlphaNumeric(s.charAt(l))) l++;
            while (r > l && !isAlphaNumeric(s.charAt(r))) r--;
            if (toCharLowerCase(s.charAt(l)) != toCharLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 'A' && c < 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    private char toCharLowerCase(char c) {
        return Character.toLowerCase(c);
    }
}
