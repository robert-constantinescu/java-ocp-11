package cJavaObjectOrientedApproach.m4.demo.staticFieldsMethodsAndClasses;

public final class ConversionHelper {

    private static final int METERS_IN_ONE_NM = 1852;

    public static int fromFeetToFlightLevel(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nauticMiles) {
        return nauticMiles * METERS_IN_ONE_NM;
    }




}
