class Solution {
    public int trap(int[] height) {
        // max l = list of max height from the left at i
        // max r = list of max height from the right at i
        // min(l,r) = list of min(l,r) - height at i
        // result = sum of min(l,r)

        int n = height.length;
        int[] maxLArr = new int[n];
        int[] maxRArr = new int[n];
        maxLArr[0] = height[0];
        maxRArr[n-1] = height[n-1];

        for (int i = 1; i < n; i++) {
            maxLArr[i] = Math.max(maxLArr[i-1], height[i]);
        }
        for (int i = n-2; i >= 0; i--) {
            maxRArr[i] = Math.max(maxRArr[i+1], height[i]);
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(maxLArr[i], maxRArr[i]) - height[i];
        }

        return sum;
    }
}