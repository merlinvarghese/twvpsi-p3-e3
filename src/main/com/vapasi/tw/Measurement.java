package com.vapasi.tw;
import java.util.Objects;

//Understands distance in various units
class Measurement {

    private static final double ONE_METER_IN_CENTIMETER = 100;
    private static final double ONE_KILOMETER_IN_CENTIMETER = 100000;
    private double value;
    private String unit;

    Measurement(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    private Measurement convertToCentimeter(Measurement measurementObject) {

        if (measurementObject.unit.equals("cm"))
            return measurementObject;

        double tempValue = 0;
        switch (measurementObject.unit) {
            case "m":
                tempValue = measurementObject.value * ONE_METER_IN_CENTIMETER;
                break;

            case "km":
                tempValue = measurementObject.value * ONE_KILOMETER_IN_CENTIMETER;
                break;
        }

        return (new Measurement(tempValue, "cm"));
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || this.getClass() !=  otherObject.getClass()) {
            return false;
        }

        Measurement otherMeasurement = (Measurement) otherObject;
        Measurement convertedInCentimeterObject = convertToCentimeter(this);
        Measurement convertedInCentimeterOtherObject = convertToCentimeter(otherMeasurement);

        return (convertedInCentimeterObject.value == convertedInCentimeterOtherObject.value) ;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(this.unit.hashCode() + this.value);
    }
}
