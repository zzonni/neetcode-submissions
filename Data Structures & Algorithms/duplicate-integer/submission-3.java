class Solution {
    public boolean hasDuplicate(int[] nums) {
        // sort in asc order
        // traverse array, check equals from index 1 to the previous until end
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
}