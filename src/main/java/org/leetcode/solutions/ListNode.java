package org.leetcode.solutions;

import java.util.Stack;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head.next;
        ListNode previous = head;
        while (current != null) {
            if (current.val == previous.val) {
                previous.next = current.next;
            } else {
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
        while (doubleStep != null) {
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
        while (currentA != null) {
            lengthA++;
            currentA = currentA.next;
        }
        while (currentB != null) {
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
        while (currentA != null && currentB != null) {
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
            } else {
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
            if (i < nodeCount / 2) {
                nodes.push(current.val);
            } else {
                if (nodeCount % 2 != 1 || i != nodeCount / 2) {
                    if (nodes.pop() != current.val) {
                        return false;
                    }
                }
            }
            current = current.next;
        }
        return true;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode previous = null;
        ListNode current = new ListNode();
        ListNode root = current;
        int sum = 0;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            current.val = sum % 10;
            sum = sum / 10;
            if (previous != null) {
                previous.next = current;
            }
            previous = current;
            current = new ListNode();
        }
        previous.next = null;
        return root;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeRemoval = null;
        ListNode tail = head;
        for (int i = 0; i < n; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        while(tail != null) {
            tail = tail.next;
            beforeRemoval = beforeRemoval == null ? head: beforeRemoval.next;
        }
        if (beforeRemoval == null) {
            if (head != null) {
                head = head.next;
            }
            return head;
        }
        if (beforeRemoval.next == null) {
            return head;
        }
        beforeRemoval.next = beforeRemoval.next.next;
        return head;
    }
// TODO: review
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode();
        ListNode prevNode = dummyNode;
        ListNode currNode = head;
        while(currNode != null && currNode.next != null){
            prevNode.next = currNode.next;
            currNode.next = prevNode.next.next;
            prevNode.next.next = currNode;

            prevNode = currNode;
            currNode = currNode.next;
        }
        return dummyNode.next;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode merged = dummy;
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merged.next = list1;
                list1 = list1.next;
            }
            else {
                merged.next = list2;
                list2 = list2.next;
            }
            merged = merged.next;
        }
        merged.next = list1 != null ? list1 : list2;
        return dummy.next;
    }

//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        ListNode current = dummy;
//        ListNode beforeLeft = null;
//        ListNode rightNode = null;
//        while (current != null) {
//            if (current.next != null && current.next.val == left) {
//                beforeLeft = current;
//            }
//            if (current.val == right) {
//                rightNode = current;
//            }
//            current = current.next;
//        }
//        ListNode leftNode =  beforeLeft.next;
//        ListNode afterRightNode =  rightNode.next;
//        beforeLeft.next = rightNode;
//        leftNode.next = afterRightNode;
//    }
}


