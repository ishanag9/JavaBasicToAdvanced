/*
package Lecture8;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        countNQueens(board, n);
    }

    private static int countNQueens(boolean[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board[row].length; col++) {
            if (isItSafe(board, row, col)) {
                board[row][col] = true;
                count = count + countNQueens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isItSafe(boolean[][] board, int row, int col) {
        for (int i = row; i < board[row].length; i++) {
            if(board[i][col]){
                return false;
            }
        }

    }
}
*/
