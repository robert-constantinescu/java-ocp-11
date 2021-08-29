package cJavaObjectOrientedApproach.m5.demo.abstractClasses;

import cJavaObjectOrientedApproach.m5.demo.abstractClasses.geography.LatLon;
import cJavaObjectOrientedApproach.m5.demo.abstractClasses.geography.Route;
import cJavaObjectOrientedApproach.m5.demo.abstractClasses.geography.Shape;
import cJavaObjectOrientedApproach.m5.demo.abstractClasses.geography.Waypoint;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> airspace = List.of(
                new Waypoint("CREOL", new LatLon(20.3, 40.7)),
                new Waypoint("ZIDCO", new LatLon(87.1, 20.7)),
                new Waypoint("RYTHM", new LatLon(44.5, 23.2)),
                new Route("ROUTE1",
                        new LatLon(41.3, 2.3),
                        new LatLon(41.5, 2.4),
                        new LatLon(41.7, 2.7)
                )
        );


        airspace.forEach(s -> {
            System.out.println(s.toWkt());
        });
    }


}
