class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for (int p : piles) r = Math.max(r, p); // maximum k-rate (bananas/hour)

        int result = r;

        while (l <= r) {
            int m = (l + r) / 2;
            long hours = 0;
            for (int p : piles) {
                hours += (long) Math.ceil((double) p / m);
            }

            if (hours <= h) {
                result = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }
}
