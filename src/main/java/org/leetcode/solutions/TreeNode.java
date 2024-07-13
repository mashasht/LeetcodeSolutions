package org.leetcode.solutions;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    Map<Integer, Integer> inorderMap = new HashMap<>();

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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == rightHeight) {
            return (int)Math.pow(leftHeight, 2) - 1;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.min(leftHeight, rightHeight) + 1;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    public List<String> binaryTreePaths(TreeNode root) {
        return returnPath(root, new StringBuilder(), new LinkedList<>());
    }

    private List<String> returnPath(TreeNode root, StringBuilder path, List<String> result) {
        if (!path.isEmpty()) {
            path.append("->");
        }
        path.append(root.val);
        if (root.left != null) {
            returnPath(root.left, new StringBuilder(path), result);
        }
        if (root.right != null) {
            returnPath(root.right, new StringBuilder(path), result);
        }
        if (root.left == null && root.right == null) {
            result.add(path.toString());
        }
        return result;
    }

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> occurrences = countOccurrences(root, new HashMap<>());
        int maxOccurences = 0;
        List<Integer> modes = new LinkedList<>();
        for (int key: occurrences.keySet()) {
            if (occurrences.get(key) > maxOccurences) {
                maxOccurences = occurrences.get(key);
                modes.clear();
                modes.add(key);
                continue;
            }
            if (occurrences.get(key) == maxOccurences) {
                modes.add(key);
            }
        }
        return modes.stream().mapToInt(Number::intValue).toArray();
    }

    private Map<Integer, Integer> countOccurrences(TreeNode root, Map<Integer, Integer> result) {
        if (root == null) {
            return result;
        }
        result.put(root.val, result.getOrDefault(root.val, 0) + 1);
        countOccurrences(root.left, result);
        countOccurrences(root.right, result);
        return result;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return constructTree(preorder, 0, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int preorderIndex, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderIndex]);
        if (left > inorderMap.get(root.val) - 1) {
            root.left = null;
        }
        else {
            preorderIndex++;
            root.left = constructTree(preorder, preorderIndex, left, inorderMap.get(root.val) - 1);
        }
        if (inorderMap.get(root.val) + 1 > right) {
            root.right = null;
        }
        else {
            preorderIndex++;
            root.right = constructTree(preorder, preorderIndex, inorderMap.get(root.val) + 1, right);
        }
        return root;
    }

    public void flatten(TreeNode root) {
        flattenToList(root);
    }
    private TreeNode flattenToList(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = flattenToList(root.left);
        TreeNode right = flattenToList(root.right);
        if (left != null) {
            root.right = left;
            if (right != null) {
                TreeNode current = root.right;
                while (current.right != null) {
                    current = current.right;
                }
                current.right = right;
            }
        }
        return root;
    }

    public int sumNumbers(TreeNode root) {
        return sumPath(root, 0);
    }

    private int sumPath(TreeNode root, int intermediateResult) {
        if (root.left == null && root.right == null) {
            return intermediateResult * 10 + root.val;
        }
        int leftResult = sumPath(root.left, intermediateResult * 10 + root.val);
        int rightResult = sumPath(root.right, intermediateResult * 10 + root.val);

        return leftResult + rightResult;
    }

    int maxPathSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathHelper(root);
        return maxPathSum;
    }
    private int maxPathHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(maxPathHelper(root.left), 0);
        int right = Math.max(maxPathHelper(root.right), 0);
        maxPathSum = Math.max(maxPathSum, left + right + root.val);
        return Math.max(left + root.val, right + root.val);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            TreeNode current = null;
            for (int i = 0; i < queueSize; i++) {
                current = queue.poll();
                if (current != null) {
                    queue.offer(current.left);
                    queue.offer(current.right);
                }
            }
            if (current != null) {
                result.add(current.val);
            }
        }
        return result;
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            int nodeCount = 0;
            int sum = 0;
            for (int i = 0; i < queueSize; i++) {
                TreeNode current = queue.poll();
                nodeCount++;
                sum += current.val;
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
                result.add((double) sum / nodeCount);
            }
        }
        return result;
    }
}
