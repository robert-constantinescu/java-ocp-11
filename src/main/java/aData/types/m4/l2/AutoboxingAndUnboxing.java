package aData.types.m4.l2;

import java.util.Arrays;
import java.util.List;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        System.out.println("\n** Custom Wrapper **\n");

        /**
         *      Autoboxing:  when a PRIMITIVE is automatically converted INTO it's WRAPPER class
         *                   the process of automatically copying a PRIMITIVE value into a NEW INSTANCE of a WRAPPER class
         *
         *      Unboxing: when a WRAPPER is automatically converted INTO it's PRIMITIVE type
         *                the process of automatically copying the WRAPPER class INSTANCE value to a standalone PRIMITIVE value
         *
         *      Autoboxing and Unboxing use VALUE copy. There are NO SHARED REFERENCES
         *
         *      Wrapper Classes are ALL FINAL(IMMUTABLE), so once created you can not alter it's value. THEY ARE IMMUTABLE
         *
         *      Casting with unboxing does not work
         *      Casting WRAPPER to WRAPPER does not work
         *
         *      One of the MAJOR ADVANTAGES of USING WRAPPER CLASSES (instead or PRIMITIVES) is the ability of having NULL value
         *          -   You can NOT set a PRIMITIVE to NULL, it MUST have a VALUE.
         *          -   an OBJECT reference can be NULL
         *
         *            WRAPPER variables can BE NULL, and that ARRAYS is, in certain kinds,
         *      a COLLECTION that CONTAIN WRAPPER classes CAN HAVE NULL ELEMENTS
         *
         */


        Integer integer = 234; //Autoboxing
        int intPrimitive = integer; // Unboxing


        /*
                Same as above, but using conversion methods
         */
        Integer integer2 = Integer.valueOf(234);
        int intPrimitive2 = integer2.intValue();


        /*
                Autoboxing of primitive literals
         */
        Boolean boolWrapper = true;
        Character charWrapper = 'A';

        Byte byteWrapper = 123;
        Short shortWrapper = 23_400;
        Integer intWrapper = 234_000;
        Long longWrapper = 234_000_000L;
        Float floatWrapper = 2.3400000f;
        Double doubleWrapper = 2.340000000000;


        /*
                Unboxing of wrapper variables
         */
        boolean boolVale = boolWrapper;
        char chaVal = charWrapper;

        byte byteVal = byteWrapper;
        short shortVal = shortWrapper;
        int intVal = intWrapper;
        long longVal = longWrapper;
        float floatVal = floatWrapper;
        double doubleVal = doubleWrapper;

        /*
                Widening with unboxing.

                While boxing is helpful, is not a PANACEA.
                Not everything you can do with PRIMITIVES can be DONE with WRAPPER classes
         */
        shortVal = byteWrapper;
        intVal = shortWrapper;
        longVal = intWrapper;
        floatVal = longWrapper;
        doubleVal = floatWrapper;

        /*
              Casting with unboxing does not work
         */
//        byteVal = (byte) shortWrapper;
//        floatVal = (float) doubleWrapper

        /*
            Casting wrapper to wrapper does not work
         */
//        shortWrapper = (short) intWrapper;
//        floatWrapper = (float) doubleWrapper;
//
//        shortWrapper = (Short) intWrapper;
//        floatWrapper = (Float) doubleWrapper;

        /*  Methods parameters support autoboxing - works the same with ALL PRIMITIVE TYPES and their corresponding WRAPPERS*/
        intVal = 9;
        wrapperMethod(intVal);

        /*  Methods parameters support boxing - works the same with ALL PRIMITIVE TYPES and their corresponding WRAPPERS */
        intWrapper = Integer.valueOf(9);
        valueMethod(intWrapper);

        /* Widening is supported when UNBOXING */
        int anInt = 9;
        shortWrapper = Short.valueOf((short) anInt);
        // if i pass a SHORT OBJECT to a method, that takes an INT, it will automatically be WIDENED to fit the INT
        valueMethod(shortWrapper);
        /**
         *              WIDENING and CASTING do not WORK between WRAPPER types
         */
        //a SHORT object CAN NOT be passed to an INTEGER parameter
//        wrapperMethod(shortWrapper);



        /*    AUTOBOXING ALSO WORKS with LIST*/

        List<Integer> list = Arrays.asList(1, 2); // INTEGER list, created with 2 PRIMITIVE ints
        /*  One of the MAJOR ADVANTAGES of USING WRAPPER CLASSES (instead or PRIMITIVES) is the ability of having NULL value */
        list.add(null);


    }

    public static void wrapperMethod(Integer intWrapper) {
        System.out.println(intWrapper);
    }

    public static void valueMethod(int intValue) {
        System.out.println(intValue);
    }
}
