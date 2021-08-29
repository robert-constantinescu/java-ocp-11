package aData.types.m5.l6;

import java.util.Arrays;


/**
 *      The VARARGS parameter (type... variableName:
 *              - can take MORE VARIABLES of the SAME TYPE, without having to LIST them individually
 *              - a VARARG can have 0, 1 or more elements
 *              - a VARARG can ALSO be NULL
 *              - When used with OTHER PARAMETERS, the VARARG MUST BE listed LAST
 *
 */
public class TheVarargsParameter {

    public static void someMethodWithVararg(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }


    /* When used with OTHER PARAMETERS, the VARARG MUST BE listed LAST*/
    public static void someMethodWithVarargAndOtherParameters(String x, double y, int... numbers) {
        System.out.println(x + ", ");
        System.out.println(y + ", ");
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        someMethodWithVararg(null);
        /*
            -the vararg is like an EMPTY ARRAY, below.
            - is NOT NULL, but it CONTAINS NO ELEMENTS
         */
        someMethodWithVararg();

        someMethodWithVararg(5); // [5]

        someMethodWithVararg(3, 5, 7, 9); // [3, 5, 7, 9]


        int[] values = new int[]{2, 4, 6, 8};
        someMethodWithVararg(values);


        someMethodWithVarargAndOtherParameters("Hello", 3.14, 1, 3, 5);



    }

}
