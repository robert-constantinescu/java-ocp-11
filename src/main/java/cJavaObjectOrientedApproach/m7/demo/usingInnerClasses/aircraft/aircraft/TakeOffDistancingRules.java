package cJavaObjectOrientedApproach.m7.demo.usingInnerClasses.aircraft.aircraft;

import java.util.Map;

public class TakeOffDistancingRules {

    // we store the associations, between enum constants and wait time, in this map
    private Map<WakeTurbulence, Integer> rules;

    //We are basically assign a wake time for each category in the WakeTurbulence enum
    public TakeOffDistancingRules() {
        rules = Map.of(
                WakeTurbulence.LIGHT, 60, //seconds delay
                WakeTurbulence.MEDIUM, 90,
                WakeTurbulence.HEAVY, 110,
                WakeTurbulence.SUPER, 180
        );
    }

    public int calculateWaitTime(Aircraft a) {
        return rules.get(a.getWakeTurbulence());
    }
}
