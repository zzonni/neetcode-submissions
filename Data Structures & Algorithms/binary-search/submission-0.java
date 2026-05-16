class Solution {
    public int search(int[] nums, int target) {
        // 2 poiner, left = start, right = end
        // mid point = l + (r-l)/2
        // num at mid < target => possibly it's on the right side => update l = mid + 1
        // num at mid > target => possibly it's on the left side => update r = mid - 1
        // num at mid = target => return m
        // else return -1 
        int n = nums.length, l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}
