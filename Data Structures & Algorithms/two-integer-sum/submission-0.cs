public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var indices = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
            indices[nums[i]] = i;
        }
        for (int i = 0; i < nums.Length; i++)
        {
            int complement = target - nums[i];
            if (indices.ContainsKey(complement) && indices[complement] != i)
            {
                return new[] {i, indices[complement]};
            }
        }
        return new int[0];
    }
}
