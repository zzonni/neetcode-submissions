class Solution {
    public boolean isAnagram(String s, String t) {
        // hashmap to store frequency of each char in string s
        // traverse string t, if any char not in hashmap => false
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();
        for (char c : cs) {
            if (hms.get(c) != null) hms.put(c, hms.get(c) + 1);
            else hms.put(c, 1);
        }
        for (char c : ct) {
            if (hmt.get(c) != null) hmt.put(c, hmt.get(c) + 1);
            else hmt.put(c, 1);
        }
        return hms.equals(hmt);
    }
}
