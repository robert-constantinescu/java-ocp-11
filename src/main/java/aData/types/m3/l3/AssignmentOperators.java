package aData.types.m3.l3;

public class AssignmentOperators {

    public static void main(String[] args) {


        /**
         *       COMPOUND ASSIGNMENT CAST the RESULT to THE ASSIGNED TYPE.
         *    THE RESULT IS NOT PROMOTED to the LARGEST type
         *
         *
         */


        int x = 5;
        int y = 3;

        int z = 5 + (y = x + y);

        /**             int z = 5 + (y = x + y);
         *      The above operations step by step:
         *      z = 5 + (y = 5 + 3)
         *      z = 5 + (y = 8 )   => y is 8 now
         *      z = 5 + 8
         *      z = 13
         */


        /**
         *  tricky question
         */

        boolean flag = false;

        z = 0;
        // What value will z have?
        // Below we assign the value TRUE to the FLAG variable, and the IF block will be executed. It's an ASSIGNMENT, not AN EQUALITY OPERATOR
        if (flag = true) {
            //z wil always be 5
            z = 5;
        } else {
            z = 3;
        }

        /**         COMPOUND ASSIGNMENT OPERATORS
         *         +=
         *         -=
         *         *=
         *         /=
         *         %=
         *
         */

        int xInt = 5;
        int yInt = 3;

//        yInt *= xInt; //15
        yInt = yInt * xInt; //15

        System.out.println(yInt);


        byte xByte = 5;
        double yDouble = 3.0;

//        xByte = xByte + yDouble  // THIS WILL THROW a COMPILATION ERROR. xByte is PROMOTED to a DOUBLE. You CAN'T fit DOUBLE in BYTE

        /**
         *              But using a COMPOUND ASSIGNMENT does not throw the same COMPILATION error,
         *        because it CAST the WHOLE RESULT, to the TYPE of the VARIABLE being assigned
         *
         *                  xByte = (byte) (xByte + yDouble);
         *
         *       COMPOUND ASSIGNMENT WIDEN OR CAST the RESULT to THE ASSIGNED TYPE.
         *    THE RESULT IS NOT PROMOTED to the LARGEST type
         *
         */
        xByte += yDouble;


        /**
         * The Conversion is done no matter how many numerical assignment are after
         */

        xByte = 5;
        yDouble = 3.0;
        float aFloat = 5.0f;
        long aLong = 10;
        short aShort = 3;

        xByte += yDouble + aFloat * aLong % aShort; //10
        // xByte = (byte)(xByte + yDouble + aFloat * aLong % aShort) ?????
        System.out.println(xByte);




    }
}

