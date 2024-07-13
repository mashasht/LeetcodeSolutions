package org.leetcode.solutions;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulateNextRightPointer {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        Queue<Node> nodes = new ArrayDeque<>();
        nodes.offer(root);
        nodes.offer(new Node(101));
        Node current = null;
        while (!nodes.isEmpty()) {
            current = nodes.poll();
            if (current.val == 101) {
                continue;
            }
            if (current.left != null) {
                nodes.offer(current.left);
            }
            if (current.right != null) {
                nodes.offer(current.right);
            }
            Node next = nodes.peek();
            if (next.val == 101) {
                current.next = null;
                nodes.offer(new Node(101));
            }
            else {
               current.next = next;
            }
        }
        return root;
    }
}
