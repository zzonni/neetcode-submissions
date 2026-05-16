class NumArray {

    private int[] prefix;
    public NumArray(int[] nums) {
        int n = nums.length;
        int cur = 0;
        prefix = new int[n];
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            prefix[i] = cur;
        }
    }
    
    public int sumRange(int left, int right) {
        int rightSum = prefix[right];
        int leftSum = left > 0 ? prefix[left - 1] : 0;
        return rightSum - leftSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */