class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                res.add(num);
            }
        }

        for (int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }

        return res.size();
    }
}