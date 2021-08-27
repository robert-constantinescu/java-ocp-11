package cJavaObjectOrientedApproach.m1.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class FlightPlan {

    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;


    // we don't instantiate classes using this constructor, but we are using it to always have an 'id' on a FlightPlan instance
    private FlightPlan() {
        System.out.println("FlightPlan()");
        this.id = UUID.randomUUID().toString();
    }

    public FlightPlan(String departure, String destination) {
        this(); //here we call the private FlightPlan() constructor, where we set the 'id' of the FlightPlan

        if (departure == null || destination == null) {
            throw new IllegalArgumentException();
        }

        System.out.printf("FlightPlan(%s, %s)\n", departure, destination);

        this.departure = departure;
        this.destination = destination;
    }


    public FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route) {

        this(departure, destination);

        if (departure == null || destination == null) {
            throw new IllegalArgumentException();
        }

        System.out.printf("FlightPlan(%s, %s, %s, %s)\n", departure, destination, departureTime, route);

        this.departureTime = departureTime;
        this.route = route;
    }


    public void print() {
        String msg =  "FlightPlan{" +
                "id='" + id + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", route=" + route +
                '}';

        System.out.println(msg);
    }
}
