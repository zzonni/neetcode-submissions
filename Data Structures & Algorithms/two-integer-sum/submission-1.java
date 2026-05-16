class Solution {
    public int[] twoSum(int[] nums, int target) {
        // store indices as a hash map with key = num, value = index
        // traverse array, calculate diff = target - num at i
        // check if this diff appear in hash map && the index != i => return result
        
        HashMap<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i =0;i<nums.length;i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[] {i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}
