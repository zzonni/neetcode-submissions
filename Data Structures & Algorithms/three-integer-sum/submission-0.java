class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort asc first to avoid duplicate triplets
        // traverse array, for each number, apply the 2 pointer to the rest of the array
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) break; // break immediately since the array is sort, if first > 0 => never sum = 0
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++; // skip similar number to avoid duplicate triplets
                }
            }
        }

        return result;
    }
}

/*
-4 -1 -1 0 1 2
*/
