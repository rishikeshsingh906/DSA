class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

       
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        placeQueens(result, board, 0, n);
        return result;
    }

    private static void placeQueens(List<List<String>> result, char[][] board, int row, int n) {
        if (row == n) { 
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) { 
                board[row][col] = 'Q'; 
                placeQueens(result, board, row + 1, n);
                board[row][col] = '.'; 
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
       
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true; 
    }

    private static List<String> constructBoard(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    
    }
}
