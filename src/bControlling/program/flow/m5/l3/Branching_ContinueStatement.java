package bControlling.program.flow.m5.l3;

public class Branching_ContinueStatement {

    public static void main(String[] args) {

        int iVal = 0;

        while (iVal < 10) {
            iVal++;
            /*  the result of this code, is that each time the value is EVEN, the RESULT will NOT be printed OUT  */
            if (iVal % 2 == 0) {
                continue; //  => SKIP everything left in the LOOP BODY, and MOVE to the NEXT ITERATION
            }
            System.out.println(iVal);
        }

    }
}
