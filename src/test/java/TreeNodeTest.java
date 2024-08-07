import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ListNode;
import org.leetcode.solutions.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TreeNodeTest {
    TreeNode treeNode;

    @BeforeEach
    void setUp() {
        treeNode = new TreeNode();
    }

    @Test
    void visitInorder_twoNodes() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        List<TreeNode> result = treeNode.visitInorder(root);
        assertEquals(1, result.getFirst().val);
        assertEquals(2, result.get(1).val);
    }
    @Test
    void visitInorder_threeNodes() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(0);
        List<TreeNode> result = treeNode.visitInorder(root);
        assertEquals(0, result.get(0).val);
        assertEquals(1, result.get(1).val);
        assertEquals(2, result.get(2).val);
    }

    @Test
    void visitInorder_sixNodes() {
        TreeNode root = new TreeNode(6);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(8);
        root.left = left;
        root.right = right;
        left.right = new TreeNode(3);
        right.left = new TreeNode(7);
        right.right = new TreeNode(9);
        List<TreeNode> result = treeNode.visitInorder(root);
        assertEquals(2, result.get(0).val);
        assertEquals(3, result.get(1).val);
        assertEquals(6, result.get(2).val);
        assertEquals(7, result.get(3).val);
        assertEquals(8, result.get(4).val);
        assertEquals(9, result.get(5).val);
    }
    @Test
    void sameTree_twoNodes_sameStructure() {
        TreeNode rootFirst = new TreeNode(1);
        rootFirst.right = new TreeNode(2);
        TreeNode rootSecond = new TreeNode(1);
        rootSecond.right = new TreeNode(2);
        assertTrue(treeNode.isSameTree(rootFirst, rootSecond));
    }
    @Test
    void sameTree_twoNodes_differentStructure() {
        TreeNode rootFirst = new TreeNode(1);
        rootFirst.right = new TreeNode(2);
        TreeNode rootSecond = new TreeNode(2);
        rootSecond.left = new TreeNode(1);
        assertFalse(treeNode.isSameTree(rootFirst, rootSecond));
    }

    @Test
    void isSymmetric_nineNodes(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        assertTrue(treeNode.isSymmetric(root));
    }

    @Test
    void maxDepth_nineNodes(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        assertEquals(3, treeNode.maxDepth(root));
    }

    @Test
    void minDepth_five(){
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        assertEquals(5, treeNode.minDepth(root));
    }

    @Test
    void findMode_122(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        assertArrayEquals(new int[]{2}, treeNode.findMode(root));
    }

    @Test
    void buildTree_3920(){
        treeNode.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }

    @Test
    void sumNumbers_123(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        assertEquals(25, treeNode.sumNumbers(root));
    }

    @Test
    void maxPathSum_negative(){
        TreeNode root = new TreeNode(-3);
        assertEquals(-3, treeNode.maxPathSum(root));
    }

    @Test
    void maxPathSum_threeElements(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(3);
        assertEquals(4, treeNode.maxPathSum(root));
    }


}
