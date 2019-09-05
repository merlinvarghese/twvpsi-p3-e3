package com.vapasi.tw;

import java.util.Objects;

public class Measurement {

    public double magnitude;
    public Unit unit;

    public Measurement(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public Measurement() {

    }

    static Measurement celcius(double magnitude) {
        return new Measurement(magnitude, Unit.C);
    }

    static Measurement ferenite(double magnitude) {
        return new Measurement(magnitude, Unit.F);
    }

    static Measurement kelvin(double magnitude) {
        return new Measurement(magnitude, Unit.K);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddableMeasurement other = (AddableMeasurement) o;
        if (!this.unit.isTypeCompatible(other.unit)) {
            return false;
        }
        return convertToBaseUnit() == other.convertToBaseUnit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit.hashCode());
    }

    public double convertToBaseUnit() {
        return unit.convertToBase(magnitude);
    }
}
