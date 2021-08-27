package bControlling.program.flow.m5.l3;

public class Branching_BreakStatement {

    public static void main(String[] args) {

        int sum = 0, iVal = 1;

        while (iVal < 10) {
            sum += iVal;
            System.out.println("iVal = " + iVal + " sum = " + sum );
            if (sum > 5)
                break;
            iVal++;
            System.out.println(iVal);
        }

        /* =================================================================================*/
        System.out.println();
        System.out.println("INNER LOOP                 ===================================");
        int iValStart = 1;
        while (iValStart < 4) {
            System.out.println("===============================:  iValStart = " + iValStart);
            int sum2 = 0;
            int iVal2 = iValStart;
            while (iVal2 < 10) {
                sum2 += iVal2;
                System.out.println("INNER: iVal = " + iVal2 + " sum = " + sum2 );
                if (sum2 > 5)
                    break; // HERE WE ONLY EXIT THE INNER LOOP, OUTER LOOP CONTINUES
                iVal2++;
                System.out.println(iVal2);
            }
            iValStart++;
        }



    }
}
