class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // since the array has already been sorted, can use two pointers
        // set left pointer = first, right pointer = last
        // then check sum of left + right
        // left + right > target => right = right - 1
        // left + right < target => left = left + 1
        // do until left + right = target
        int n = numbers.length, l = 0, r = n - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) r--;
            else if (sum < target) l++;
            else return new int[] {l + 1, r + 1};
        }
        return new int[0];
    }
}
