class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (backtrack(board, word, r, c, 0)) return true;
            }
        }

        return false;
    }

    private boolean backtrack(char[][] board, String word, int row, int col, int index) {

        if (index == word.length()) return true;

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) return false;

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = backtrack(board, word, row + 1, col, index + 1) ||
                        backtrack(board, word, row - 1, col, index + 1) ||
                        backtrack(board, word, row, col + 1, index + 1) ||
                        backtrack(board, word, row, col - 1, index + 1);

        board[row][col] = temp;

        return found;
    }
}
