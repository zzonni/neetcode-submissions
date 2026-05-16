class Solution {
    public int[] productExceptSelf(int[] nums) {
        // use prefix and suffix arrays to precompute the product on the left and right
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1; // nothing on the left on num at 0
        suff[n-1] = 1; // nothing on the right on num at n-1

        // p1 = n0 x p0
        // p2 = n1 x p1 = n1 x n0 x p0
        // p3 = n2 x p2 = n2 x n1 x n0 x p0 => p0 must be 1

        for (int i = 1; i < n; i++) {
            pref[i] = nums[i-1] * pref[i - 1];
        }

        for (int i = n-2; i >= 0; i--) {
            suff[i] = nums[i+1] * suff[i+1];
        }

        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }
        
        return res;
    }
}
