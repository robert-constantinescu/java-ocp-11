package cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism;

import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.airspace.AirSector;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.airspace.EnRouteSector;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.airspace.TMASector;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Circle;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Coordinate;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Rectangle;
import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.radar.Aircraft;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Define sectors with bad weather
        /* all the sector are stored using the same reference variable,
            either if they are a TMASector or an EnRouteSector

         */

        List<AirSector> sectorsWithBadWeather = List.of(
                new TMASector(
                        new Circle(new Coordinate(20, 20), 10),
                        100),
                new EnRouteSector(
                        new Rectangle(
                                new Coordinate(0, 0),
                                new Coordinate(10, 20),
                                new Coordinate(0, 20),
                                new Coordinate(10, 0)),
                        200, 400));

        // Define aircraft that are currently flying
        List<Aircraft> flyingAircraft = List.of(
                new Aircraft("OS876", new Coordinate(20, 20), 50),
                new Aircraft("RO345", new Coordinate(5, 15), 200),
                new Aircraft("TA234", new Coordinate(30, 10), 230)
        );

        // OS876 in TMA,
        // RO345 in EnRoute
        sectorsWithBadWeather.forEach(s -> {
            flyingAircraft.forEach(a -> {
                if (s.isInSector(a.getCoordinate(), a.getAltitudeFl())) {
                    System.out.println("WARNING -> " + a.getCallSign() + " in bad weather sector");
                }
            });
        });

        // OS876 in TMA,
        // RO345 in EnRoute
        sectorsWithBadWeather.forEach(c -> System.out.println(c.isCrowded(1, 10)));

    }


}
