package cJavaObjectOrientedApproach.m2.demo;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Create radar target
        RadarTarget os791 = new RadarTarget(
                "OS791",
                280,
                "B737-800"
        );

        System.out.println(os791.getLabel());
        System.out.println();

        //change altitude command
        os791.changeAltitude(200);


        //Keep detecting target to see command executed
        for (int i = 0; i < 5; i++) {
            sleep(1000);
            System.out.println(os791.getLabel());
            System.out.println();

        }

    }
}
