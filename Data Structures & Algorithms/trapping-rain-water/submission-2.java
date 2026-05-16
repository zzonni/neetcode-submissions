class Solution {
    public int trap(int[] height) {
        // 2 pointer: l = start, r = end
        // leftMax = max height value for at l
        // rightMax = max height value for r
        // leftMax < rightMax => l++ 
        // => update max value for l at i after shift => calculate water = min(leftMax, rightMax) - height at i
        // leftMax > rightMax => r--
        // => update max value for r at i after shift => calculate water = min(leftMax, rightMax) - height at i
        
        int n = height.length, l = 0, r = n-1, leftMax = height[l], rightMax = height[r];
        int i = 0, sum = 0;
        while (l<r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                int res = Math.min(leftMax, rightMax) - height[l];
                sum += (res <= 0 ? 0 : res);
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                int res = Math.min(leftMax, rightMax) - height[r];
                sum += (res <= 0 ? 0 : res);
            }
            i++;
        }

        return sum;
    }
}
