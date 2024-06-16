package org.leetcode.solutions;

public class BoxesInWarehouse {
    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
        int boxesCounter = 0;
        for (int i = 0; i < warehouse.length; i++) {
            int closestBox = 0;
            int closestBoxIndex = -1;
            for (int j = 0; j < boxes.length; j++) {
                if (boxes[j] != 0 && warehouse[i] - boxes[j] >= 0 && warehouse[i] - boxes[j] < warehouse[i] - closestBox) {
                    closestBox = boxes[j];
                    closestBoxIndex = j;
                }
            }
            if (closestBoxIndex != -1) {
                boxes[closestBoxIndex] = 0;
                boxesCounter++;
            }
        }
        return boxesCounter;
    }
}
