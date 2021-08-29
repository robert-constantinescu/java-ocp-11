package cJavaObjectOrientedApproach.m4.demo.staticFieldsMethodsAndClasses;

public class Main {

    public static void main(String[] args) {

        int altitudeInFeet = 28000;
        double distInNm = 10;

        int altitudeInFlightLevel = ConversionHelper.fromFeetToFlightLevel(300);
        System.out.println(altitudeInFeet + " ft -> FL " + altitudeInFlightLevel);

        double distInMeters = ConversionHelper.fromNmToMeters(10);
        System.out.println(distInNm + "Nm ->" + distInMeters + " m");


        Calculators.Distance distance = new Calculators.Distance(1, 1, 3, 3);
        System.out.println("Distance is: " + distance.calculate());

    }
}
