class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            prefix[i] = cur;
        }

        for (int i = 0; i < n; i++) {
            int leftPivotSum = i == 0 ? 0 : prefix[i - 1];
            int rightPivotSum = i == 0 
            ? prefix[n-1] - prefix[0] 
            : i == (n-1) ? 0 : prefix[n-1] - prefix[i];
            if (leftPivotSum == rightPivotSum) return i; 
        }
        return -1;
    }
}