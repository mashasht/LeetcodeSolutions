package org.leetcode.solutions;

public class MovingAverage {
    int[] stream;
    int size;
    int sum;
    int insert;

    public MovingAverage(int size) {
        this.stream = new int[size];
        this.size = 0;
        this.sum = 0;
        this.insert = 0;
    }


    public double next(int val) {
        if (size == stream.length) {
            sum -= stream[insert];
        } else {
            size++;
        }
        sum += val;
        stream[insert] = val;
        insert = (insert + 1) % stream.length;
        return (double) sum / size;
    }
}
