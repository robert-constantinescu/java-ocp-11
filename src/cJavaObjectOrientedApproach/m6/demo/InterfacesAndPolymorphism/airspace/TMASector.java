package cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.airspace;

import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Circle;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Coordinate;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.DistanceCalculator;

// TMA is the area around an airport that a plane can surveill
// the lower altitude limit is always 0
public class TMASector implements AirSector {
    private Circle shape;

    private int upperAltitudeFl;

    public TMASector(Circle shape, int upperAltitudeFl) {
        this.shape = shape;
        this.upperAltitudeFl = upperAltitudeFl;
    }

    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if (altitude > this.upperAltitudeFl) {
            return false;
        }
        double distanceToRadius =
                DistanceCalculator.calculate(x, this.shape.getOrigin());
        return distanceToRadius < this.shape.getRadiusNm();
    }
}
