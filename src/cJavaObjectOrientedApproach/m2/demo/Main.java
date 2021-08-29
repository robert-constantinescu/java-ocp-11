package cJavaObjectOrientedApproach.m2.demo;


import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Partial Flight plan

        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP");

        berlinToBucharest.print();

        System.out.println();

        //Complete flight plan

        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 1, 10, 23, 15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );

        parisToLondon.print();

    }


}
