package bControlling.program.flow.m2.l3;

public class ChainingIfElse {

    public static void main(String[] args) {
        int val1 = 10, val2 = 40, diff = 0;

        // ONLY FIRST TRUE STATEMENT WILL BE EXECUTED
        if (val1 > val2) {
            diff = val1 - val2;
            System.out.println("Val1 is bigger");
        }
        else if (val1 < val2) {
            diff = val2 - val1;
            System.out.println("Val2 is bigger");
        }
        else if (val1 < val2) {
            diff = val2 - val1;
            System.out.println("Val2 second statement is bigger");
        }
        //optionally
        else {
            System.out.println("Val1 and val 2 are equals second statement is bigger");
        }

/*=====================================================================================================================*/
/*=====================================================================================================================*/

        int age = 70;
        /*                                ONLY FIRST TRUE STATEMENT WILL BE EXECUTED                      */
        if (age > 17) {
            System.out.println("ADULT");
        }
        else if (age > 64) {
            System.out.println("SENIOR ADULT");
        }
        else {
            System.out.println("MINOR");
        }

    }
}
