package org.leetcode.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
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
        if (p == null) {
            return q == null;
        }
        if (q == null) {
            return false;
        }
       if (p.val != q.val) {
           return false;
       }
       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = Math.max(maxDepth(root.left), maxDepth(root.right));
        return maxDepth + 1;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isBalanced(TreeNode root) {
        return returnHeight(root) > 0;
    }

    private int returnHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int rightHeight = returnHeight(root.right);
        int leftHeight = returnHeight(root.left);
        if (rightHeight == -1 || leftHeight == -1) {
            return -1;
        }
        if (Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }
        return Math.max(rightHeight, leftHeight) + 1;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        boolean leftResult = false;
        boolean rightResult = false;
        if (root.left != null) {
            leftResult = hasPathSum(root.left, targetSum - root.val);
        }
        if (root.right != null) {
            rightResult = hasPathSum(root.right, targetSum - root.val);
        }
        return leftResult || rightResult;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[nums.length/2]);
        int[] leftTree = new int[nums.length/2];
        int[] rightTree = new int[nums.length - nums.length/2 - 1];
        System.arraycopy( nums, 0, leftTree, 0, nums.length/2);
        System.arraycopy( nums, nums.length/2 + 1, rightTree, 0, nums.length - nums.length/2 - 1);
        root.left = sortedArrayToBST(leftTree);
        root.right = sortedArrayToBST(rightTree);
        return root;
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (right == null || left == null) {
            return false;
        }
        if (right.val != left.val) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
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

    public int minDepth(TreeNode root) {
        int leftDepth = Integer.MAX_VALUE;
        int rightDepth = Integer.MAX_VALUE;
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        if (root.left != null) {
            leftDepth = minDepth(root.left);
        }
        if (root.right != null) {
            rightDepth = minDepth(root.right);
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.right;
        if (root.left != null) {
            root.right = invertTree(root.left);
        }
        if (temp != null) {
            root.left = invertTree(temp);
        }
        return root;
    }

    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return 0;
        }
        double diff = Math.abs(target - root.val);
        int closest = root.val;
        do {
            if (Math.abs(target - root.val) < diff) {
                diff = Math.abs(target - root.val);
                closest = root.val;
            }
            if (target < root.val) {
                root = root.left;
            }
            else {
                root = root.right;
            }
        } while (root != null);
        return closest;
    }
}
