package aData.types.m5.l6;

public class LocalVariableTypeInference {

    /**
     *      -  the  'var' type is an INFERRED TYPE, meaning it takes the type of the FIRST variable is initially assigned
     *
     *      -  once a 'var' variable has been declared an initialized, it's TYPE is FIXED.
     *      -  A 'var' CAN NOT CHANGE it's TYPE
     *      -  a 'var' CAN ONLY be USED for declaring a LOCAL VARIABLE
     *      -  when a VAR is DECLARED, it MUST BE INITIALIZED in the SAME STATEMENT
     *      - a var CAN NOT be INSTANTIATED with a NULL value, UNLESS it's CASTED to the TYPE you want to ASSUME
     *      - a var CAN NOT be DECLARED in a MULTIVERBAL OPERATION
     *      - a var CAN NEVER be USED as a METHOD PARAMETER
     *
     */

    {
        var value = 1;
    }

    /*               a 'var' CAN ONLY be USED for declaring a LOCAL VARIABLE              */
//    static var someValue = 1;    // COMPILE ERROR
//    var someInstanceValue = "My value";  // COMPILE ERROR

    public static String staticMethod() {
        var h = "hi there";
        return h;
    }

    public int instanceMethod() {
        var q = 1;
        return q += 1;
    }

    /*               - a var CAN NEVER be USED as a METHOD PARAMETER        */
//    public LocalVariableTypeInference( var a) {
//        COMPILE ERROR
//    }

//    public void whatever(var a, var b) {
//        COMPILE ERROR
//    }

//    public static void something(var x, var y) {
//        COMPILE ERROR
//    }

    public static void main(String[] args) {

        System.out.println("\n** Local Variable Type Inference**\n");

        int x = 1;
        var y = 1;     // y is an int type, any INTEGRAL literal, will be an 'int';
        var z = 3.14f; // z is a float type

        var intX = 5;
        /*   when a VAR is DECLARED, it MUST BE INITIALIZED in the SAME STATEMENT  */

//        var intY; // COMPILE ERROR
//        intY = 2;
//        var result = intX + intY;

        /*a var CAN NOT be INSTANTIATED with a NULL value, UNLESS it's CASTED to the TYPE you want to ASSUME*/
//        var name = null; // COMPILE ERROR
        var name = (String) null;


        /*     a var CAN NOT be DECLARED in a MULTI VERBAL(COMPOUND) OPERATION  */
        int nInt = 1, mInt = 2, oInt = 3;
//        var pInt = 1, qInt = 2, rInt = 3;  // COMPILE ERROR











    }
}
