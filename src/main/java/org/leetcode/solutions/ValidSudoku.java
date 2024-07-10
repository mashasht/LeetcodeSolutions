package org.leetcode.solutions;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][] squares = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int currentNum = board[i][j] - '0' - 1;
                if (rows[i][currentNum] == 1) {
                    return false;
                }
                if (columns[j][currentNum] == 1) {
                    return false;
                }
                if (squares[i / 3 * 3 + j / 3][currentNum] == 1) {
                    return false;
                }
                rows[i][currentNum] = 1;
                columns[j][currentNum] = 1;
                squares[i / 3 * 3 + j / 3][currentNum] = 1;
            }
        }
        return true;
    }
}
