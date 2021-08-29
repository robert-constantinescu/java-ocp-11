package bControlling.program.flow.m2.l2;

public class BlockStatements {

    public static void main(String[] args) {
        int val1 = 10, val2 = 4;
        int diff = 0;

        if (val1 > val2)
            diff = val1 - val2;
        else
            diff = val2 - val1;
            /* the print statement will always be executed*/
            System.out.println("val1 is NOT bigger than val2");


    /*================================================================================================================*/
    /*================================================================================================================*/
        if (val1 > val2)
            diff = val1 - val2;
        else {
            diff = val2 - val1;
            /* the print statement is now ONLY EXECUTED with the ELSE will always be executed*/
            System.out.println("val1 is NOT bigger than val2");
        }

    /*=======================               COMPILE ERROR              =============================================*/
    /*================================================================================================================
     *         if you DON'T have CURLY brackets for the IF-STATMENT, with MULTIPLE line of CODES
     *   the COMPILER will THROW an ERROR for THE ELSE, because IT WILL NOT KNOW with WHAT to ASSOCIATE the IF
     */
    /**

        if (val1 > val2)
            diff = val1 - val2;
            System.out.println("val1 is NOT bigger than val2");

        else {
            diff = val2 - val1;
            System.out.println("val1 is NOT bigger than val2");
        }

        */
    }
}
