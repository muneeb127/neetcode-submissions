class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Row Pass
        for(int i = 0; i < board.length; i++){
            char[] row = board[i];
            Set<Character> rowSet = new HashSet<>();

            for(int j = 0; j < row.length; j++){
                if(board[i][j] == '.') continue;
                if(rowSet.contains(board[i][j])){
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }

        // Col Pass
        for(int i = 0; i < board.length; i++){
            char[] col = board[i];
            Set<Character> colSet = new HashSet<>();

            for(int j = 0; j < col.length; j++){
                if(board[j][i] == '.') continue;
                if(colSet.contains(board[j][i])){
                    return false;
                }
                colSet.add(board[j][i]);
            }
        }

        //3x3 Pass
        for(int sq = 0; sq < board.length; sq++){
            Set<Character> seen = new HashSet<>();

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                    if(board[row][col] == '.') continue;
                    if(seen.contains(board[row][col])){
                        return false;
                    }
                    seen.add(board[row][col]);
                }
            }
        }


        return true;
    }
}
