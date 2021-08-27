package bControlling.program.flow.m5.l4;

public class TheReturnStatement {

    public static void main(String[] args) {

        System.out.println(" BEFORE METHOD CALL");
        methodReturnWithLoops();
        System.out.println(" AFTER METHOD CALL");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(" BEFORE SECOND METHOD CALL");
        methodWithLoops();
        System.out.println(" AFTER SECOND METHOD CALL");


    }



    public static void methodReturnWithLoops() {
        for (int iValStart = 1; iValStart < 4; iValStart++) {
            System.out.println("FIRST LOOP  ======================  iValStart = " + iValStart);
            for (int iVal = iValStart; iVal < 10; iVal++) {
                System.out.println("SECOND LOOP @@@@@@@@@@@@@@@@@@  iVal = " + iVal);
                if (iVal == 3) return; // RETURN IMMEDIATELY BEGIN THE PROCESS OF EXITING THE METHOD
            }
        }
    }

    public static void methodWithLoops() {
        for (int iValStart = 1; iValStart < 4; iValStart++) {
            System.out.println("FIRST LOOP  ======================  iValStart = " + iValStart);
            for (int iVal = iValStart; iVal < 10; iVal++) {
                System.out.println("SECOND LOOP @@@@@@@@@@@@@@@@@@  iVal = " + iVal);
            }
        }
    }


}
