import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class ListNodeTest {
    ListNode listNode;

    @BeforeEach
    void setUp() {
        listNode = new ListNode();
    }

    @Test
    void deleteDuplicates_twoDuplicate_returnsThreeElements() {
        ListNode fourth = new ListNode(3);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);
        ListNode head = new ListNode(1, first);
        ListNode newHead = head.deleteDuplicates(head);
        assertEquals(1,newHead.val);
        assertEquals(2,newHead.next.val);
        assertEquals(3,newHead.next.next.val);
    }

    @Test
    void deleteDuplicates_oneDuplicate_returnsOneElements() {
        ListNode first = new ListNode(1);
        ListNode head = new ListNode(1, first);
        ListNode newHead = head.deleteDuplicates(head);
        assertEquals(1,newHead.val);
    }

    @Test
    void hasCycle_twoElements_returnsTrue() {
        ListNode first = new ListNode(1);
        ListNode head = new ListNode(1, first);
        first.next = head;
        assertTrue(head.hasCycle(head));
    }

    @Test
    void hasCycle_twoElements_returnsFalse() {
        ListNode first = new ListNode(1);
        ListNode head = new ListNode(1, first);
        assertFalse(head.hasCycle(head));
    }

    @Test
    void hasIntersection_eightNodes_returnsTrue() {
        ListNode sixth = new ListNode(5);
        ListNode fifth = new ListNode(4, sixth);
        ListNode fourth = new ListNode(8, fifth);
        ListNode third = new ListNode(1, fourth);
        ListNode second = new ListNode(6, third);
        ListNode headB = new ListNode(5, second);
        ListNode secondA = new ListNode(1, fourth);
        ListNode headA = new ListNode(4, secondA);
        assertEquals(8, headA.getIntersectionNode(headA, headB).val);
    }

    @Test
    void reverseList_returnsReversedList() {
        ListNode fifth  = new ListNode(5);
        ListNode fourth  = new ListNode(4, fifth);
        ListNode third  = new ListNode(3, fourth);
        ListNode second  = new ListNode(2, third);
        ListNode first = new ListNode(1, second);
        first.reverseList(first);
        assertEquals(4, fifth.next.val);
    }

    @Test
    void isPalindrome_returnsFalse() {
        ListNode second  = new ListNode(2);
        ListNode first = new ListNode(1, second);
        assertFalse(first.isPalindrome(first));
    }

    @Test
    void isPalindrome_returnsTrue() {
        ListNode third  = new ListNode(1);
        ListNode second  = new ListNode(0, third);
        ListNode first = new ListNode(1, second);
        assertTrue(first.isPalindrome(first));
    }

    @Test
    void addTwoNumbers_708(){
        ListNode third1  = new ListNode(3);
        ListNode second1  = new ListNode(4, third1);
        ListNode first1 = new ListNode(2, second1);
        ListNode third2  = new ListNode(4);
        ListNode second2  = new ListNode(6, third2);
        ListNode first2 = new ListNode(5, second2);
        ListNode result = first2.addTwoNumbers(first1, first2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    void addTwoNumbers_9999(){
        ListNode second1  = new ListNode(9);
        ListNode first1 = new ListNode(9, second1);
        ListNode third2  = new ListNode(9);
        ListNode second2  = new ListNode(9, third2);
        ListNode first2 = new ListNode(9, second2);
        ListNode result = first2.addTwoNumbers(first1, first2);
        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(0, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }

}
