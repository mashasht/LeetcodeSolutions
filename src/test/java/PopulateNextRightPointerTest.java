import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.PopulateNextRightPointer;
import org.leetcode.solutions.TreeNode;

public class PopulateNextRightPointerTest {
    PopulateNextRightPointer populateNextRightPointer;

    @BeforeEach
    void setUp(){
        populateNextRightPointer = new PopulateNextRightPointer();
    }

    @Test
    void connect_1234(){
        PopulateNextRightPointer.Node root = new PopulateNextRightPointer.Node(1);
        root.left = new PopulateNextRightPointer.Node(2);
        root.right = new PopulateNextRightPointer.Node(3);
        root.left.left = new PopulateNextRightPointer.Node(4);
        root.left.right = new PopulateNextRightPointer.Node(5);
        root.right.right = new PopulateNextRightPointer.Node(7);
        populateNextRightPointer.connect(root);
    }
}
