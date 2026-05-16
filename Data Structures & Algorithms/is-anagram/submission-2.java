class Solution {
    public boolean isAnagram(String s, String t) {
        // sort 2 string arrays then compare
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }
}
