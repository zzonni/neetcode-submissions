class Solution {
    public boolean isValid(String s) {
        char[] cs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put(']','[');
        hm.put('}','{');

        for (char c : cs) {
            if (hm.containsKey(c)) {
                if (!stack.isEmpty() && hm.get(c) == stack.peek()) {
                    stack.pop();
                } else return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
