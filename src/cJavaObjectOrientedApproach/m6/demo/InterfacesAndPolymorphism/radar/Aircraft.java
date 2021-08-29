package cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.radar;

import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Coordinate;


//basic implementation of a class
public class Aircraft {
    private String callSign;
    private Coordinate coordinate;
    private int altitudeFl;

    public Aircraft(String callSign, Coordinate coordinate, int altitudeFl) {
        this.callSign = callSign;
        this.coordinate = coordinate;
        this.altitudeFl = altitudeFl;
    }

    public String getCallSign() {
        return callSign;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public int getAltitudeFl() {
        return altitudeFl;
    }
}
