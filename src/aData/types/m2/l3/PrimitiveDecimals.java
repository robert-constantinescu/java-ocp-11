package aData.types.m2.l3;

public class PrimitiveDecimals {
    public static void main(String[] args) {
        System.out.println("\n ** Primitive Decimals ** \n");


        /**      Floats and doubles hold decimal point numbers
         *
         *  The major difference between float and double is the number of biti used to store data:
         *          float:  32 biti
         *          double: 64 biti
         *
         *
         *  if you don't specify the 'f' from the end, the compiler assumes is a double
         *
         *  if you assign too many values to a float or a double, it will round to the last digit it can display
         *
         * */

        float piFloat = 3.14f;
        double piDouble = 3.14;

        piFloat = 3.141592653f;
        //prints: 3.1415927
        piDouble = 3.14159265358979323;
        // prints: 3.141592653589793

        System.out.println("piFloat = " + piFloat);
        System.out.println("piDouble = " + piDouble);

        float pFloat = .98768f;


        /**
         *  floats and doubles can be assigned INTEGRALS without decimal points.
         *
         *  In fact, double & float, unlike integrals, will not overflow.
         *
         *  If the INTEGRAL value assigned to a double or a float is too large, it SWITCHES to SCIENTIFIC notation to accommodate
         *
         *  The conversion to scientific notation, can also result in loss of accuracy
         *
         */

        float longToFloat = 1111111112222222223L;
        double longToDouble = 1111111112222222223L;
        System.out.println("\n");
        System.out.println("longToFloat = " + longToFloat);
        System.out.println("longToDouble = " + longToDouble);

    }

}

