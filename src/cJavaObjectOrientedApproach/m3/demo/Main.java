package cJavaObjectOrientedApproach.m3.demo;

import static cJavaObjectOrientedApproach.m3.demo.ConversionHelper.fromNmToMeters;

public class Main {

    public static void main(String[] args) {

        int altitudeInFeet = 28000;
        double distInNm = 10;

        int altitudeInFlightLevel = ConversionHelper.fromFeetToFlightLevel(300);
        System.out.println(altitudeInFeet + " ft -> FL " + altitudeInFlightLevel);

        double distInMeters = fromNmToMeters(10);
        System.out.println(distInNm + "Nm ->" + distInMeters + " m");


        Calculators.Distance distance = new Calculators.Distance(1, 1, 3, 3);
        System.out.println("Distance is: " + distance.calculate());

    }
}
