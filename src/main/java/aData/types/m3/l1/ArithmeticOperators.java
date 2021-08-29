package aData.types.m3.l1;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("\n** Arithmetic Operators ** \n");

        byte byteResult = 5 + 3; //8

        byte xByte = 5;
        byte yByte = 3;

        /**
         *      Rule of Thumb: The COMPILER will PROMOTE members of the operation to an INT, or to the HIGHER variable type, before executing any operation
         *
         *        The below will not work:
         *           byteResult = xByte + yByte;
         *
         *        This is because when a byte is used in an arithmetic operation,
         *    the compiler first PROMOTES the bytes to an INT.
         *        The result will be an INT primitive, which can not be fit into a byte
         *
         */
//        byteResult = xByte + yByte;
        int intResult = xByte + yByte;

        /**
         *
         *          EXACTLY THE SAME happens with SHORT types. Any SHORT variable used in an ARITHMETIC operation is
         *      automatically promoted to an INT
         */

        short xShort = 5;
        yByte = 3;

//        short shortResult = xShort + yByte;
        intResult = xShort + yByte;


        /**
         *        Below the int and the short are PROMOTED TO LONG, BEFORE the operation is executed
         *      a LONG can not fit into INT, so the code WILL NOT COMPILE
         */
        xShort = 5;
        int yInt = 3;
        long zLong = 10;

//        intResult = xShort + yInt * zLong;
        long longResult = xShort + yInt * zLong;

        /**
         *      Below the compiler will PROMOTE all the terms of operation TO A DOUBLE, just BEFORE the CALCULATION
         *    a DOUBLE can not fit into a FLOAT, so the code WILL NOT COMPILE
         */
        xByte = 5;
        float yFloat = 3.0f;
        double zDouble = 10.0;

//        float floatResult = xByte + yFloat * zDouble;
        double doubleResult = xByte + yFloat * zDouble;




    }
}
