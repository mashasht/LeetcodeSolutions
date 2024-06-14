package org.leetcode.solutions;

import java.util.Stack;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head.next;
        ListNode previous = head;
        while(current != null) {
            if (current.val == previous.val) {
                previous.next = current.next;
            }
            else {
                previous = current;
            }
            current = current.next;
        }
        return head;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode oneStep = head;
        ListNode doubleStep = head.next.next;
        while(doubleStep != null) {
            if (doubleStep == oneStep) {
                return true;
            }
            if (doubleStep.next == null) {
                return false;
            }
            oneStep = oneStep.next;
            doubleStep = doubleStep.next.next;
        }
        return false;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode currentA = headA;
        ListNode currentB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while(currentA != null) {
            lengthA++;
            currentA = currentA.next;
        }
        while(currentB != null) {
            lengthB++;
            currentB = currentB.next;
        }
        currentA = headA;
        for (int i = 0; i < lengthA - lengthB; i++) {
            currentA = currentA.next;
        }
        currentB = headB;
        for (int i = 0; i < lengthB - lengthA; i++) {
            currentB = currentB.next;
        }
        while(currentA != null && currentB != null) {
            if (currentA == currentB) {
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode previous = head;
        ListNode current = head.next;
        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
                current = current.next;
            }
            else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
// TODO: review
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = previous;
            previous = head;
            head = temp;
        }

        return previous;
    }

    public boolean isPalindrome(ListNode head) {
        int nodeCount = 0;
        ListNode current = head;
        while (current != null) {
            nodeCount++;
            current = current.next;
        }
        current = head;
        Stack<Integer> nodes = new Stack<>();
        for (int i = 0; i < nodeCount; i++) {
            if (i < nodeCount/2) {
                nodes.push(current.val);
            }
            else {
                if (nodeCount % 2 != 1 || i != nodeCount/2) {
                    if (nodes.pop() != current.val) {
                        return false;
                    }
                }
            }
            current = current.next;
        }
        return true;
    }
}


