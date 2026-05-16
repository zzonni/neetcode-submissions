class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // find target in which row
        int top = 0, bot = matrix.length - 1;
        while (top <= bot) {
            int row = (top + bot) / 2;
            // if first number in row > target, means the target is lying on
            // some of the rows above since each row already sorted
            if (matrix[row][0] > target) {
                bot = row - 1;
            } else if (matrix[row][matrix[0].length - 1] < target) {
                top = row + 1;
            } else {
                break;
            }
        }

        if (top > bot) return false;
        int row = (top + bot) /2 ;
        int l = 0, r = matrix[0].length - 1;
        while (l <= r) {
            int m = (l+r)/2;
            if (matrix[row][m] > target) {
                r = m - 1;
            } else if (matrix[row][m] < target) {
                l = m + 1;
            } else return true;
        }
        return false;
    }
}
