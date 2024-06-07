import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MergeSortedArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray;

    @BeforeEach
    void setup(){
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    void merge_OneToSix(){
        int[] mArr = new int[]{1,2,3,0,0,0};
        mergeSortedArray.merge(mArr, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, mArr);
    }

}
