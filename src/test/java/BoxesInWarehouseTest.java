import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.BoxesInWarehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxesInWarehouseTest {
    BoxesInWarehouse boxesInWarehouse;

    @BeforeEach
    void setUp(){
        boxesInWarehouse = new BoxesInWarehouse();
    }

    @Test
    void maxBoxesInWarehouse_fiveBoxes_fourIn(){
        assertEquals(4, boxesInWarehouse.maxBoxesInWarehouse(new int[]{1,2,2,3,4}, new int[]{3,4,1,2}));
    }

    @Test
    void maxBoxesInWarehouse_fourBoxes_threeIn(){
        assertEquals(3, boxesInWarehouse.maxBoxesInWarehouse(new int[]{4,5,6,2}, new int[]{3,2,6,3,3,7}));
    }
}
