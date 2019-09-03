package com.vapasi.tw;

class Unit {
    private static final double CM_TO_CM = 1;
    private static final double M_TO_CM = 100;
    private static final double KM_TO_CM = 100000;
    private final double conversionFactor;

    static final Unit CMS = new Unit(CM_TO_CM);
    static final Unit M = new Unit(M_TO_CM);
    static final Unit KMS = new Unit(KM_TO_CM);

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

     double getConversionFactor(double magnitude) {
        return magnitude * this.conversionFactor;
    }
}
