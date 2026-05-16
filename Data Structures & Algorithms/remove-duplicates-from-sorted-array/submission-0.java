class Solution {
    public int removeDuplicates(int[] nums) {
        // left = 1; right = 1
        // traverse array, nums[right] != nums[right - 1] => left++
        // => nums[left] = nums[right]; 
        // return left (left to track number of unique value)
        int n = nums.length, l = 1, r = 1;
        while (r < n) {
            if (nums[r] != nums[r-1]) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}