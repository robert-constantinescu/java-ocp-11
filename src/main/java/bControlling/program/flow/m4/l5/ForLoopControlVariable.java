package bControlling.program.flow.m4.l5;

public class ForLoopControlVariable {

    public static void main(String[] args) {
        int factorial = 1;
        for (int num = 3; num > 1; num--) {
            factorial *= num;
            System.out.println(num + " | " + factorial);
//            num = num + 5; // this is TOTALLY LEGAL CODE, but NOT RECOMMENDED
        }

        /*          the NUM control variable, has it's SCOPE LIMITED to THE LOOP itself
                in THIS CASE, it CAN NOT be USED OUTSIDE the LOOP
         */
//        System.out.println(num); // WON'T COMPILE
        System.out.println("Result: " + factorial);


        /*===============================     FOR LOOPS with 2 or more CONTROL VARIABLES        ========================================*/
        float[] vals1 = {10.0f, 20.0f, 15.0f, 10.0f, 20.0f, 15.0f, 10.0f, 20.0f, 15.0f, 10.0f, 20.0f, 15.0f};
        float[] vals2 = {10.0f, 20.0f, 15.0f, 10.0f, 20.0f, 15.0f, 10.0f, 20.0f, 15.0f, 10.0f, 20.0f, 15.0f};
        float sum = 0.0f;
        for (int i = 0, j = vals2.length - 1; i < vals1.length; i++, j--) {
            sum = vals1[i] + vals2[j];
            System.out.println(sum);
        }

        /*===============================     FOR LOOPS with more CONTROL VARIABLES        ========================================*/
        sum = 0.0f;
        System.out.println("MORE CONTROL VARIABLES LOOP");
        for (int i = 0, j = vals2.length - 1, p = 1; i < vals1.length; i++, j--, p *= j + i) {
            sum = vals1[i] + vals2[j];
            System.out.println(sum);
            System.out.println("p: " + p);
        }
    }
}
