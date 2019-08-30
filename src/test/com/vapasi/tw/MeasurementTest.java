package com.vapasi.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeasurementTest {
    @Test
    void expect100CmEquals1100cm() {
        Measurement distanceInCentimeter = new Measurement(100, "cm");
        Measurement otherDistanceInCentimeter = new Measurement(100, "cm");

        boolean compareResult = distanceInCentimeter.equals(otherDistanceInCentimeter);

        assertTrue(compareResult);
    }

    @Test
    void expect100cmEquals1Meter() {
        Measurement distanceInCentimeter = new Measurement(100, "cm");
        Measurement distanceInMeter = new Measurement(1, "m");

        boolean compareResult = distanceInCentimeter.equals(distanceInMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect100000CmEquals1Kilometer() {
        Measurement distanceInCentimeter = new Measurement(100000, "cm");
        Measurement distanceInKiloMeter = new Measurement(1, "km");

        boolean compareResult = distanceInCentimeter.equals(distanceInKiloMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect2mEquals200Centimeter() {
        Measurement distanceInCentimeter = new Measurement(200, "cm");
        Measurement distanceInMeter = new Measurement(2, "m");

        boolean compareResult = distanceInCentimeter.equals(distanceInMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect5MeterEquals5Meter() {
        Measurement distanceInMeter = new Measurement(5, "m");
        Measurement otherDistanceInMeter = new Measurement(5, "m");

        boolean compareResult = distanceInMeter.equals(otherDistanceInMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect5000MeterEquals5Kilometer() {
        Measurement distanceInMeter = new Measurement(5000, "m");
        Measurement distanceInKiloMeter = new Measurement(5, "km");

        boolean compareResult = distanceInMeter.equals(distanceInKiloMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect4KiloMeterEquals400000Centimeters() {
        Measurement distanceInCentiMeter = new Measurement(400000, "cm");
        Measurement distanceInKiloMeter = new Measurement(4, "km");

        boolean compareResult = distanceInCentiMeter.equals(distanceInKiloMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect4KiloMeterEquals4000Meters() {
        Measurement distanceInMeters = new Measurement(4000, "m");
        Measurement distanceInKiloMeter = new Measurement(4, "km");

        boolean compareResult = distanceInMeters.equals(distanceInKiloMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect7KiloMeterEquals7Kilometers() {
        Measurement distanceInKiloMeters = new Measurement(7, "km");
        Measurement otherDistanceInKiloMeter = new Measurement(7, "km");

        boolean compareResult = distanceInKiloMeters.equals(otherDistanceInKiloMeter);

        assertTrue(compareResult);
    }

    @Test
    void expect4KiloMeterIsNotEquals3Meters() {
        Measurement distanceInKiloMeter = new Measurement(4, "km");
        Measurement distanceInMeters = new Measurement(3, "m");

        boolean compareResult = distanceInMeters.equals(distanceInKiloMeter);

        assertFalse(compareResult);
    }
}
