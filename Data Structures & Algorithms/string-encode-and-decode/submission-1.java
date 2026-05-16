class Solution {
    // cannot create private variable to store state, both functions must be stateless
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            int sLen = s.length();
            // append current string length and a symbol to
            // prevent any of that number or symbol appear in
            // the string itself
            sb.append(sLen);
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        StringBuilder sbLen = new StringBuilder();
        while (i < str.length()) {
            StringBuilder sb = new StringBuilder();
            if (str.charAt(i) != '#') {
                sbLen.append(String.valueOf(str.charAt(i)));
                i++;
                continue;
            }
            int len = Integer.parseInt(sbLen.toString());
            sbLen = new StringBuilder();
            sb.append(str.substring(i+1, i+1+len));
            res.add(sb.toString());

            i = i + len + 1;
        }

        return res;
    }
}
