class Solution {
    public int rob(int[] nums) {
        // finding: maximum amount of money can rob up to house i
        // how to get there: skip i (dp[i-1]) or rob i (dp[i-2] + nums[i])
        // dp[i] = max(dp[i-1], dp[i-2] + nums[i])
        int n = nums.length;

        if (n == 1) return nums[0];

        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int current = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
