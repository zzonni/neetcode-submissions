class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            // not in hashset then add + calculate max size of the window
            // else remove from hashset and shift the pointer
            // its like starting the window again
            while (seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
