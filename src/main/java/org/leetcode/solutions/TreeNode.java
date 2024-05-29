package org.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<TreeNode> pNodes = visitInorder(p);
        List<TreeNode> qNodes = visitInorder(q);
        if (pNodes.size() != qNodes.size()) {
            return false;
        }
        for (int i = 0; i < pNodes.size(); i++) {
            if (pNodes.get(i).val != qNodes.get(i).val) {
                return false;
            }
            if (pNodes.get(i).left == null && qNodes.get(i).left != null ||
                    pNodes.get(i).left != null && qNodes.get(i).left == null) {
                return false;
            }
            if (pNodes.get(i).right == null && qNodes.get(i).right != null ||
                    pNodes.get(i).right != null && qNodes.get(i).right == null) {
                return false;
            }
        }
        return true;
    }
    public List<TreeNode> visitInorder(TreeNode root) {
        TreeNode current = root;
        List<TreeNode> visited = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        while (current != null || nodes.size() > 0) {
            while (current !=  null) {
                nodes.push(current);
                current = current.left;
            }
            current = nodes.pop();
            visited.add(current);
            current = current.right;
        }
        return visited;
    }
}
