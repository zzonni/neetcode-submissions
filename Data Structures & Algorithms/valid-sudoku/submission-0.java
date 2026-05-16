class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char val = board[row][i];
                if (val == '.') continue;
                if (seen.contains(val)) return false;
                seen.add(val);
            }
        }
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char val = board[i][col];
                if (val == '.') continue;
                if (seen.contains(val)) return false;
                seen.add(val);
            }
        }

        for (int sq = 0; sq < 9; sq++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                    char val = board[row][col];
                    if (val == '.') continue;
                    if (seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }
        return true;

    }
}
