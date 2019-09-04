package com.vapasi.tw;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {
    @Nested
    class LengthTest {
        @Test
        void expect20CMEquals20CM() {
            Unit unit = Unit.CM;
            double actualOutput = unit.convertToBase(20);
            assertEquals(20, actualOutput);
        }

        @Test
        void expect20MEquals2000CM() {
            Unit unit = Unit.M;
            double actualOutput = unit.convertToBase(20);
            assertEquals(2000, actualOutput);
        }

        @Test
        void expect20KMEquals200000CM() {
            Unit unit = Unit.KM;
            double actualOutput = unit.convertToBase(20);
            assertEquals(2000000, actualOutput);
        }
    }

    @Nested
    class WeightTest {
        @Test
        void expect1KgEquals1000Gm() {
            Unit unit = Unit.KG;
            double actualOutput = unit.convertToBase(1);

            assertEquals(1000, actualOutput);
        }
    }

    @Nested
    class TemperatureTest {

        @Test
        void expect32FEquals0C() {
            Unit unit = Unit.F;
            double actual = unit.convertToBase(32.0);

            assertEquals(0, actual);
        }

        @Test
        void expect0CFEquals_273K() {
            Unit unit = Unit.K;
            double actual = unit.convertToBase(-273);

            assertEquals(0, actual);
        }


    }
}
