class Solution {
    public int maxArea(int[] heights) {
        // init l = start, right = end
        // calculate initial area = min(l,r) x (r - l)
        // init max = inital area
        // l < r => l = l + 1 => new area = new l x (r - new l)
        // new area > max => max = new area
        // repeat until have final max
        int n = heights.length, l = 0, r = n - 1;
        int max = 0;
        while (l < r) {
            int area = 0;
            if (heights[l] < heights[r]) {
                area = heights[l] * (r - l);
                l++;
            } else {
                area = heights[r] * (r - l);
                r--;
            }
            if (area > max) max = area;
        }

        return max;
    }
}

/*
1 7 2 5 4 7 3 6
*/
