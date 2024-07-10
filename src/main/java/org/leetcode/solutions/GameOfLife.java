package org.leetcode.solutions;

import java.util.Arrays;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        if (board.length == 0) {
            return;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int currentValue = 10 + 10 * board[i][j];
                int neighborsAlive = countNeighbors(board, i, j);
                if (neighborsAlive == 3) {
                    board[i][j] = currentValue + 1;
                }
                if (neighborsAlive < 2) {
                    board[i][j] = currentValue;
                }
                if (neighborsAlive == 2) {
                    board[i][j] = currentValue + board[i][j];
                }
                if (neighborsAlive > 3) {
                    board[i][j] = currentValue;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = board[i][j] % 10;
            }
        }
    }

    private int countNeighbors(int[][] board, int i, int j) {
        int alive = 0;
        int[][] ds = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int[] d : ds) {
            if (i + d[0] >= 0 && i + d[0] < board.length && j + d[1] >= 0 && j + d[1] < board[0].length) {
                if (board[i + d[0]][j + d[1]] == 1 || board[i + d[0]][j + d[1]] >= 20) {
                    alive++;
                }
            }
        }
        return alive;
    }
}
