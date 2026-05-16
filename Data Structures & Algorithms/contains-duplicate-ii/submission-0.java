class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // window size = k => can be equals or less than k
        // create a hashset to store unique value and check duplicate
        // l = 0 (start of window), r = 0 -> k-1
        /*
            l=1 => r = 1->k-1 + 1
            l=2 => r = 2 => k - 1 + 2

            r = 0 -> min(k + l - 1, nums length - 1)

            if r - l > k => remove the first num at l from hashset, then shift l

        */

        Set<Integer> window = new HashSet<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (r - l > k) {
                window.remove(nums[l]);
                l++;
            }
            if (window.contains(nums[r])) {
                return true;
            }

            window.add(nums[r]);
        }
        return false;
    }
}