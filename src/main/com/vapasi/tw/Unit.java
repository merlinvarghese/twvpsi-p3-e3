package com.vapasi.tw;

//understands standard of measurement
class Unit {
    private static final double MULTIPLIER_CM_METER = 100;
    private static final double MULTIPLIER_CM_KILOMETER = 100000;
    private static final double MULTIPLIER_METER_CM = 0.01;
    private static final double MULTIPLIER_KM_CM = 0.000001;
    private static final double MULTIPLIER_GM_KG = 1000;
    private static final double MULTIPLIER_KG_GM = 0.0001;
    private static final String LENGTH = "length";
    private static final String WEIGHT = "weight";

    static final Unit CM = new Unit(1, LENGTH);
    static final Unit M = new Unit(MULTIPLIER_CM_METER, LENGTH);
    static final Unit KM = new Unit(MULTIPLIER_CM_KILOMETER, LENGTH);
    static final Unit GM = new Unit(1, WEIGHT);
    static final Unit KG = new Unit(MULTIPLIER_GM_KG, WEIGHT);

    private double conversionFactor;
    private String type;

    private Unit(double conversionFactor, String type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    double convertToBase(double magnitude) {
        return magnitude * this.conversionFactor;
    }

    boolean isTypeCompatible(Unit other) {
        return this.type.equals(other.type);
    }

    double convertTo(double magnitude, Unit unit) {
        double newConversionFactor = this.conversionFactor/unit.conversionFactor;
        return magnitude * newConversionFactor;
    }
}