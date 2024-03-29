package com.vapasi.tw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.vapasi.tw.AddableMeasurement.*;
import static org.junit.jupiter.api.Assertions.*;

class AddableMeasurementTest {
    @Test
    void expect100CmEquals100cm() {
        assertEquals(true, cm(100).equals(cm(100)));
    }

    @Test
    void expect100cmEquals1Meter() {
        assertEquals(true, cm(100).equals(meter(1)));
    }

    @Test
    void expect100000CmEquals1Kilometer() {
        assertEquals(true, cm(100000).equals(km(1)));
    }

    @Test
    void expect2mEquals200Centimeter() {
        assertEquals(true, meter(2).equals(cm(200)));
    }

    @Test
    void expect5MeterEquals5Meter() {
        assertEquals(true, meter(5).equals(meter(5)));
    }

    @Test
    void expect5000MeterEquals5Kilometer() {
        assertEquals(true, meter(5000).equals(km(5)));
    }

    @Test
    void expect4KiloMeterEquals400000Centimeters() {
        assertEquals(true, km(4).equals(cm(400000)));
    }

    @Test
    void expect4KiloMeterEquals4000Meters() {
        assertEquals(true, km(4).equals(meter(4000)));
    }

    @Test
    void expect7KiloMeterEquals7Kilometers() {
        assertEquals(true, km(7).equals(km(7)));
    }

    @Test
    void expectFalseWhenOneObjectIsNull() {
        assertFalse(cm(30).equals(null));
    }

    @Test
    void expectOneKgEqualToThousandGm() {
        assertEquals(kg(1), gm(1000));
    }

    @Test
    void expectOneKilometerNotEqualTo1Kg() {
        assertNotEquals(km(1), kg(1));
    }

    @Test
    void expectAdditionNotAllowedWhen100CmAddedTo100Gm() {
        try {
            cm(100).add(gm(100));
            Assertions.fail("Method threw exception");
        } catch (CannotAddException e) {
            System.out.println("Test passed");
        }
    }

    @Test
    void expect300CmEqualsTo100CmAddedTo2M() throws CannotAddException {
        AddableMeasurement expected = cm(300);

        AddableMeasurement actual = cm(100).add(meter(2));

        assertEquals(expected, actual);
    }

    @Test
    void expect2_2KgEqualsTo2KgAddedTo200Gm() throws CannotAddException {
        AddableMeasurement expected = kg(2.2);

        AddableMeasurement actual = kg(2).add(gm(200));

        assertEquals(expected, actual);
    }

    @Test
    void expect1002MeterEqualsTo2MeterAddedTo1Km() throws CannotAddException {
        AddableMeasurement expected = meter(1002);

        AddableMeasurement actual = meter(2).add(km(1));

        assertEquals(expected, actual);
    }


}
