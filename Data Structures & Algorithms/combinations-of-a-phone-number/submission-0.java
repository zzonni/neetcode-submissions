class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> hm = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack(hm, digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(Map<Character, String> hm, String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        for (char c : hm.get(digits.charAt(index)).toCharArray()) {
            current.append(c);
            backtrack(hm, digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
