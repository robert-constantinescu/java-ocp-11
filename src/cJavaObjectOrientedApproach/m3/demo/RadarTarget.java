package cJavaObjectOrientedApproach.m3.demo;

import java.util.concurrent.ExecutorService;

import static java.lang.Math.random;
import static java.lang.System.lineSeparator;
import static java.lang.Thread.sleep;
import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class RadarTarget {

    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private String model;

    public RadarTarget(String callSign, int flightLevel, String model) {
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.requiredFlightLevel = flightLevel;
        this.model = model;
    }

    public String getLabel() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.callSign);
        sb.append(lineSeparator());

        sb.append(this.flightLevel)
                .append(this.getClimbDescendIndicator())
                .append(this.requiredFlightLevel);
        sb.append(lineSeparator());

        sb.append(model);
        return sb.toString();
    }

    private String getClimbDescendIndicator() {
        if (this.requiredFlightLevel > this.flightLevel) {
            return "/\\";
        }

        if (this.requiredFlightLevel < this.flightLevel) {
            return "\\/";
        }

        return "=";
    }

    public void changeAltitude(int newFl) {
        System.out.println(this.callSign + " change altitude " + newFl);
        System.out.println();

        this.requiredFlightLevel = newFl;

        //Simulate long running operation
        ExecutorService es = newSingleThreadExecutor();
        es.execute( () -> {
            try {
                sleep((long) (random() * 5 * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.flightLevel = requiredFlightLevel;
        });
    }


}
