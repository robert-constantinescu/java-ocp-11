package aData.types.m2.l2;

import java.util.Random;

public class FieldsVsVariables {
    /**
     *  - Both class variables and instance variables are initialized with DEFAULT VALUES (google for the table or check OneNote)
     *  - a PRIMITIVE field or LOCAL variable cannot be assigned null
     */

    /**
     *  - The below are Class level
     *  - Static (aka class) variable
     */
    static int field_a = 1000;
    static String field_b = "static string";

    /**
     * Instance variables
     */
    float filed_c = 122;
    String field_d = "a string";

    /**
     * - Local variables are defined in methods or code blocks
     * - They must be EXPLICITLY INITIALIZED before their use
     */
    public void method_1() {

        short variable_a = 122;
        String variable_b = "a string";
    }

    public static void main(String[] args) {
        long variable_c;
        String variable_d;

        /**
            At exam make sure that the local variables are actually initialized.
         */

        /**
         * Partial initialization WON'T COMPILE
         *
         * Partial initialization is when a LOCAL variable is only initialized under specific conditions
         *
         * Partial initialization is if the ELSE statement is commented out
         */

        boolean flag = (new Random()).nextBoolean();
        long variable_x;
        if (flag) {
            variable_x = 100L;
        }
        else {
            variable_x = 500L;
        }

        System.out.println(variable_x);

        /**
         * Partial initialization WON'T COMPILE
         *
         * Partial initialization is also when a SWITCH statement is created without a DEFAULT branch
         */

        Random random = new Random();
        int testValue = random.nextInt(5 - 1) + 1;

        long var_y;
        switch (testValue) {
            case 1:
                var_y = 100L;
            case 2:
                var_y = 100L;
            case 3:
                var_y = 100L;
            default:
                var_y = 0L;
        }

        System.out.println(var_y);


        /**
         * Partial initialization WON'T COMPILE
         *
         * We see it again in loops (for & while for ex).
         * Below @var_z is only initialized if the value of the @flag_1 = true   so the code will not compile
         *
         */

        boolean flag_1 = (new Random()).nextBoolean();
        long var_z;

        while(flag_1) {
            var_z = 100L;
        }

//        System.out.println(var_z);








    }
}
