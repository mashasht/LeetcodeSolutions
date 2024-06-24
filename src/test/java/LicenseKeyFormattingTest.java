import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LicenseKeyFormatting;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LicenseKeyFormattingTest {
    LicenseKeyFormatting licenseKeyFormatting;
    @BeforeEach
    void setUp(){
        licenseKeyFormatting = new LicenseKeyFormatting();
    }

    @Test
    void licenseKeyFormatting_k4(){
        assertEquals("5F3Z-2E9W", licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    void licenseKeyFormatting_k2(){
        assertEquals("2-5G-3J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
