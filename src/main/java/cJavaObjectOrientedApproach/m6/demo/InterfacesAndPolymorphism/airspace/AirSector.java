package cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.airspace;

import cJavaObjectOrientedApproach.m6.demo.InterfacesAndPolymorphism.geography.Coordinate;

/*
    we need from all the sector to provide a contract or API, that we can use to check if an Aircraft is in it
 */
public interface AirSector {

    boolean isInSector(Coordinate x, int altitude);

    default boolean isCrowded(int aircraft, int maxNbAircraft) {
        return aircraft > maxNbAircraft;
    }
}
