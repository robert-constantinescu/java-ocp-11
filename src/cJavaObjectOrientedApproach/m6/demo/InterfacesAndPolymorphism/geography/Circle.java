package cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography;

public class Circle {

    //central coordinate
    private Coordinate origin;
    //circle radius
    private int radiusNm;

    public Circle(Coordinate origin, int radiusNm) {
        this.origin = origin;
        this.radiusNm = radiusNm;
    }

    public Coordinate getOrigin() {
        return origin;
    }

    public int getRadiusNm() {
        return radiusNm;
    }
}
