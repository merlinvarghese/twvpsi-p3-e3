package com.vapasi.tw;
import java.util.Objects;

//Understands length in various units
class Distance {
    private final double value;
    private final Unit unit;

    static Distance cms(int magnitude) {
        return new Distance(magnitude,Unit.CMS);
    }

    static Distance km(int magnitude) {
        return new Distance(magnitude, Unit.KMS);
    }

    static Distance meter(int magnitude) {
        return new Distance(magnitude, Unit.M);
    }

    Distance(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if ((otherObject == null) || (this.getClass() != otherObject.getClass())) {
            return false;
        }
        Distance otherDistance = (Distance) otherObject;
        return this.unit.getConversionFactor(this.value)  == otherDistance.unit.getConversionFactor(otherDistance.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.hashCode() + this.value);
    }
}
