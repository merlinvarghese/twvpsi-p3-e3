package com.vapasi.tw;

//Understands quantification in various units
class AddableMeasurement extends Measurement {

    public AddableMeasurement(double magnitude, Unit cm) {
        super();
    }

    static AddableMeasurement cm(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.CM);
    }

    static AddableMeasurement km(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.KM);
    }

    static AddableMeasurement meter(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.M);
    }

    static AddableMeasurement kg(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.KG);
    }

    static AddableMeasurement gm(double magnitude) {
        return new AddableMeasurement(magnitude, Unit.GM);
    }

    AddableMeasurement add(AddableMeasurement other) throws CannotAddException {
        if(!this.unit.isTypeCompatible(other.unit))
            throw new CannotAddException();
/*        if(this.unit.isBaseUnit()){
            return new Measurement(this.magnitude + other.convertToBaseUnit(), this.unit);
        }*/
        double magnitudeOther = other.unit.convertTo(other.magnitude, this.unit);
        return new AddableMeasurement(this.magnitude + magnitudeOther, this.unit);
    }
}
