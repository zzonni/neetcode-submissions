class Solution {
    public int rob(int[] nums) {
        // what to find: maximum amount of money can rob up to house i => dp[i]
        // how: break into 2 linear problem: A = rob form 0..n-2 or B = 1..n-1 => max(A,B)
        int n = nums.length;

        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        

        return Math.max(robRange(nums, 0, n-2), robRange(nums, 1, n-1));
    }

    private int robRange(int[] nums, int start, int end) {
            int prev2 = nums[start];
            int prev1 = Math.max(nums[start], nums[start + 1]);
            
            for (int i = start + 2; i <= end; i++) {
                int current = Math.max(prev1, prev2 + nums[i]);
                prev2 = prev1;
                prev1 = current;
            }

            return prev1;
        }
}
