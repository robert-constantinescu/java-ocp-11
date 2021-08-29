package aData.types.m3.l5;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println("\n ** Logical Operators **");

        int xInt = 7;
        boolean yBool = false;

        /**
         * The second operator will be ingored if the first one is true. Which is the case here
         *  yBoll will still be FALSE after this operation, because the 2nd PART is never executed. Since the firs is true
         *
         *  In the first operator:
         *      1. First the equality is check
         *      2. Then the xInt is incremented
         */
        boolean result = (++xInt <= 7) || (yBool = true);
        System.out.println(result);



        /* demo boolean variables */

        boolean tru_1 = true;
        boolean tru_2 = true;
        boolean fls_1 = false;
        boolean fls_2 = false;

        /*
            Logical & (AND) Operator
            Both sides must be true for result to be true
         */
        result = tru_1 & tru_2; //true
        result = tru_1 & fls_1; //false
        result = fls_2 & tru_2; //false


        /*
            Logical && (Short-circuit AND) Operator
            Both sides must be true for result to be true. Short-circuits if left is false
         */
        result = tru_1 && tru_2; //true
        result = tru_1 && fls_1; //false
        result = fls_2 && tru_2; //false short-circuited


        /*
            Logical | ( OR ) Operator
            At lest one side must be true, for result to be true
         */
        result = tru_1 | tru_2; //true
        result = tru_1 | fls_1; //true
        result = fls_1 | fls_2; //false


        /*
            Logical || (Short-circuit OR ) Operator
            At lest one side must be true, for result to be true. Short-Circuits if left is true
         */
        result = tru_1 || tru_2; //true - short-circuited
        result = fls_2 || tru_2; //true
        result = fls_1 || fls_2; //false -  short-circuited


        /*
            Logical ^ (Exclusive OR ) Operator
            ONE side must be TRUE, and ONE side FALSE, for it to be TRUE
            BOTH SIDES false or true => FALSE
         */
        result = tru_1 ^ tru_2; // false
        result = tru_1 ^ fls_1; // true
        result = fls_1 ^ fls_2; // false


    }
}
