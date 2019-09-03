package com.vapasi.tw;
import org.junit.jupiter.api.Test;

import static com.vapasi.tw.Distance.cms;
import static com.vapasi.tw.Distance.meter;
import static com.vapasi.tw.Distance.km;
import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {
    @Test
    void expect100CmEquals100cm() {
        assertEquals(true,cms(100).equals(cms(100)));
    }

    @Test
    void expect100cmEquals1Meter() {
        assertEquals(true, cms(100).equals(meter(1)));
    }

    @Test
    void expect100000CmEquals1Kilometer() {
        assertEquals(true,cms(100000).equals(km(1)));
    }

    @Test
    void expect2mEquals200Centimeter() {
        assertEquals(true,meter(2).equals(cms(200)));
    }

    @Test
    void expect5MeterEquals5Meter() {
        assertEquals(true,meter(5).equals(meter(5)));
    }

    @Test
    void expect5000MeterEquals5Kilometer() {
        assertEquals(true,meter(5000).equals( km(5)));
    }

    @Test
    void expect4KiloMeterEquals400000Centimeters() {
        assertEquals(true, km(4).equals(cms(400000)));
    }

    @Test
    void expect4KiloMeterEquals4000Meters() {
        assertEquals(true,km(4).equals(meter(4000)));
    }

    @Test
    void expect7KiloMeterEquals7Kilometers() {
        assertEquals(true,km(7).equals( km(7)));
    }

    @Test
    void expectFalseWhenOneObjectIsNull() {
        assertFalse(cms(30).equals(null));
    }
}
