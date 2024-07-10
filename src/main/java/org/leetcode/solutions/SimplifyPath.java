package org.leetcode.solutions;

import java.util.List;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> folders = new Stack<>();
        folders.addAll(List.of(path.split("/")));
        StringBuilder result = new StringBuilder();
        int backCounter = 0;
        while (!folders.empty()) {
            String currentFolder = folders.pop();
            while (currentFolder.equals("..") && !folders.empty()) {
                currentFolder = folders.pop();
                backCounter++;
            }
            if (currentFolder.equals(".") || currentFolder.isEmpty()) {
                continue;
            }
            if (backCounter > 0) {
                backCounter--;
                continue;
            }
            result.insert(0, "/" + currentFolder);
        }
        if (result.isEmpty()) {
            return "/";
        }
        return result.toString();
    }
}
