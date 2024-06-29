package org.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToNew = new HashMap<>();
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            oldToNew.put(current, newNode);
            current = current.next;
        }
        current = head;
        while (current != null) {
            Node newNode = oldToNew.get(current);
            newNode.next = oldToNew.get(current.next);
            newNode.random = oldToNew.get(current.random);
            current = current.next;
        }
        return oldToNew.get(head);
    }
}
