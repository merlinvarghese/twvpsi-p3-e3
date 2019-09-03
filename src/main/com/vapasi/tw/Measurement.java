package com.vapasi.tw;

import java.util.Objects;

//Understands quantification in various units
class Measurement {
    private final double magnitude;
    private final Unit unit;

    private Measurement(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    static Measurement cm(double magnitude) {
        return new Measurement(magnitude, Unit.CM);
    }

    static Measurement km(double magnitude) {
        return new Measurement(magnitude, Unit.KM);
    }

    static Measurement meter(double magnitude) {
        return new Measurement(magnitude, Unit.M);
    }

    static Measurement kg(double magnitude) {
        return new Measurement(magnitude, Unit.KG);
    }

    static Measurement gm(double magnitude) {
        return new Measurement(magnitude, Unit.GM);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement other = (Measurement) o;
        if (!this.unit.isTypeEqualTo(other.unit)) {
            return false;
        }
        return convertToBaseUnit() == other.convertToBaseUnit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit.hashCode());
    }

    private double convertToBaseUnit() {
        return unit.convertToBase(magnitude);
    }

}
