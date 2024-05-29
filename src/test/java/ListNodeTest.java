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

}
