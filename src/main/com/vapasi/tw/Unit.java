package com.vapasi.tw;

//understands standard of measurement
class Unit {
    private static final double MULTIPLIER_CM_METER = 100;
    private static final double MULTIPLIER_CM_KILOMETER = 100000;
    private static final double MULTIPLIER_GM_KG = 1000;


    private static final String LENGTH = "length";
    private static final String WEIGHT = "weight";
    private static final String TEMPERATURE = "temperature";


    static final Unit CM = new Unit(1, LENGTH,0);
    static final Unit M = new Unit(MULTIPLIER_CM_METER, LENGTH,0);
    static final Unit KM = new Unit(MULTIPLIER_CM_KILOMETER, LENGTH,0);
    static final Unit GM = new Unit(1, WEIGHT,0);
    static final Unit KG = new Unit(MULTIPLIER_GM_KG, WEIGHT,0);
    static final Unit C = new Unit(1, TEMPERATURE,0);
    static final Unit F = new Unit(5.0/9, TEMPERATURE,-160.0/9);
    static final Unit K = new Unit(1, TEMPERATURE,273);

    private double conversionFactor;
    private String type;
    private double offset;

    private Unit(double conversionFactor, String type, double offset) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.offset = offset;
    }

    double convertToBase(double magnitude) {
         double value = (magnitude * this.conversionFactor) + this.offset;
         return  value;
    }

    boolean isTypeCompatible(Unit other) {
        return this.type.equals(other.type);
    }

    double convertTo(double magnitude, Unit unit) {
        double newConversionFactor = (this.conversionFactor/unit.conversionFactor) - offset;
        return magnitude * newConversionFactor;
    }
}