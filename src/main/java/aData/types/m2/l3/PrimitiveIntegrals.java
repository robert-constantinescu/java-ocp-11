package aData.types.m2.l3;

public class PrimitiveIntegrals {
    public static void main(String[] args) {
        System.out.println("\n ** Primitive Integrals ** \n");

        /**
         *      A byte is a sequence of 8 biti: 0000 0000
         *
         *
         *      A byte is particularly useful in arrays.
         *      If you have a very large byte array, but the data in each element can be expressed in a byte,
         *  rather than an object or any other primitive types, then a byte can save some memory
         *
         *      A byte can also be used to help express the fact that a variable has a limited range
         */
        //byte range
        byte maxByte = 127;
        byte minByte = -128;


        /**
         *      A short is twice the size of a byte, with 16 biti: 0000 0000 0000 0000
         *
         *      The advantages of using a short instead of a other types, are pretty much the same as for the byte,
         * the difference being as for the range is larger
         *
         */
        //short range
        short maxShort = 32767;
        short minShort = -32768;


        /**
         *         An int is twice the size of a short, with 32 biti: 0000 0000 0000 0000 0000 0000 0000 0000
         */
        //int range
        int maxInt = 2147483647;
        int minInt = -2147483648;


        /**
         *         A long is twice the size of a int, with 64 biti: 0000 0000 0000 0000 0000 0000 0000 0000
         *                                                          0000 0000 0000 0000 0000 0000 0000 0000
         *
         *         longs are often used to measure time in milliseconds
         *
         *         The 'L' from the end, tells the compiler it's a long type. Is required when using literals
         */
        //long range
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;

    }
}
