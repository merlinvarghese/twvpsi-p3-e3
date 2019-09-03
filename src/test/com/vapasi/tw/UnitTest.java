package com.vapasi.tw;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTest {
    @Test
    void getConversionFactor() {
        Unit unit = Unit.CMS;
        assertEquals(1,unit.getConversionFactor(1));
    }
}
