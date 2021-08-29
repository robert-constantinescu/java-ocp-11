package cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.airspace;

import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Coordinate;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Rectangle;

public class EnRouteSector implements AirSector {

    // we need some altitude boundaries
    private int lowerAltitudeFl;
    private int upperAltitudeFl;
    // and a horizontal geometry shape
    private Rectangle shape;

    public EnRouteSector(Rectangle shape, int lowerAltitudeFl, int upperAltitudeFl) {
        this.shape = shape;
        this.lowerAltitudeFl = lowerAltitudeFl;
        this.upperAltitudeFl = upperAltitudeFl;
    }

    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if (altitude > this.upperAltitudeFl) {
            return false;
        }
        if (altitude < this.lowerAltitudeFl) {
            return false;
        }

        return shape.containsCoordinate(x);
    }
}
