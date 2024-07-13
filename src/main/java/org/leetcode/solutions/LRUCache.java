package org.leetcode.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {
    Map<Integer, Integer> keyValueStore;
    final int capacity;
    List<Integer> lastUsed;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.keyValueStore = new HashMap<>();
    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {

    }
}
