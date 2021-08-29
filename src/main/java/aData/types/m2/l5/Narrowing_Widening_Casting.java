package aData.types.m2.l5;

public class Narrowing_Widening_Casting {
    public static void main(String[] args) {

        System.out.println("\n Narrowing, Widening, and Casting ** \n");


        /**
         *      Widening:  Putting a smaller primitive into a larger primitive
         *          for example any BYTE fit in SHORT which fits in INT which fits in LONG
         *       This is also true for ANY FLOAT can fit in a DOUBLE
         *
         */
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;

        float floatValue = 3.14592F;
        double doubleValue = floatValue;

        floatValue = intValue;
        doubleValue = longValue;


        /**
         *      NARROWING:  If a PRIMITVE variable or literal is withing range of a PRIMITIVE TYPE variable, you can place the LARGER primitives into the SMALLER primitives
         *      BUT, if the VALUE IS TOO LARGE, it will be TRIMMED DOWN, RESULTING in a DIFFERENT number. This is called   ===========     OVERFLOW     =============
         */

        longValue = 100L;
        intValue = (int) longValue;
        shortValue = (short) intValue;
        byteValue = (byte) shortValue;

        doubleValue = byteValue;
        floatValue = (float) doubleValue;

    }
}
