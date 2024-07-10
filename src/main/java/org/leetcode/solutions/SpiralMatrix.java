package org.leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        int col = 0, row = 0;
        int width = matrix[row].length;
        int height = matrix.length;
        int leftRow = 0;
        int upCol = 1;
        while (width - leftRow > 0 && height - upCol >= 0) {
            for (; col < width; col++) {
                visit(matrix, row, col, result);
            }
            col--;
            row++;
            for (; row < height; row++) {
                visit(matrix, row, col, result);
            }
            row--;
            col--;
            for (; col >= leftRow; col--) {
                visit(matrix, row, col, result);
            }
            col++;
            row--;
            for (; row >= upCol; row--) {
                visit(matrix, row, col, result);
            }
            row++;
            col++;
            width--;
            height--;
            leftRow++;
            upCol++;
        }
        return result;
    }

    private static void visit(int[][] matrix, int row, int col, List<Integer> result) {
        if ( matrix[row][col] != 101) {
            result.add(matrix[row][col]);
            matrix[row][col] = 101;
        }
    }
}
