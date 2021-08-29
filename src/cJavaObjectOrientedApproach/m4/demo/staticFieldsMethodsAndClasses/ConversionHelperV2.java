package cJavaObjectOrientedApproach.m4.demo.staticFieldsMethodsAndClasses;

public final class ConversionHelperV2 {

    private static int metersInOneNauticalMile;

    static {
        metersInOneNauticalMile = 1852;
    }

    public static int fromFeetToFlightLevel(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nauticMiles) {
        return nauticMiles * metersInOneNauticalMile;
    }



}
