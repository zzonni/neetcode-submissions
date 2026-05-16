class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }
        int count = 0;
        for (int num : nums) {
            int streak = 0, current = num;
            while (seen.contains(current)) { 
                // because already store all nums into a hashset
                // so for each num, simply increase its value by 1 and the streak until
                // reaching a value not in the hashset 
                streak++;
                current++;
            }
            // store the current streak
            count = Math.max(count, streak);
        }
        return count;
    }
}
// 2 3 4 4 5 10 20