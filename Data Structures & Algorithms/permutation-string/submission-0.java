class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int len = hm.size();
        for (int l = 0; l < s2.length(); l++) {
            int r = 0;
            Map<Character, Integer> hm2 = new HashMap<>();
            for (int j = l; j < s2.length(); j++) {
                char c = s2.charAt(j);
                hm2.put(c, hm2.getOrDefault(c, 0) + 1);

                if (hm.getOrDefault(c, 0) < hm2.get(c)) break;
                if (hm.getOrDefault(c, 0) == hm2.get(c)) {
                    r++;
                }

                if (r == len) return true;
            }
        }

        return false;
    }
}
