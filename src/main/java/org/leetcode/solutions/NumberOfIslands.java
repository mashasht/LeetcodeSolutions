package org.leetcode.solutions;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int numOfIslands = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    queue.offer(new int[]{i, j});
                }
                while(!queue.isEmpty()) {
                    int[] nodeToVisit = queue.poll();
                    grid[i][j] = '0';
                    for (int[] direction: directions) {
                        int nx = nodeToVisit[0] + direction[0];
                        int ny = nodeToVisit[1] + direction[1];
                        if (nx < grid.length && ny < grid[i].length &&
                                nx >= 0 && ny >= 0 && grid[nx][ny] == '1') {
                            queue.offer(new int[]{nx, ny});
                        }
                    }
                }
            }
        }
        return numOfIslands;
    }
}
