package org.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    Map<String, Integer> messageToTimestamp;
    public Logger() {
        messageToTimestamp = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (messageToTimestamp.containsKey(message)) {
            if (messageToTimestamp.get(message) + 10 > timestamp) {
                return false;
            }
        }
        messageToTimestamp.put(message, timestamp);
        return true;
    }
}
