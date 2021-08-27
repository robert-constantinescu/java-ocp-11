package aData.types.m3.l9;

public class MathAPIs {

    public static void main(String[] args) {
        System.out.println("\n** Math APIs\n");

        double result = Math.random(); // returns a double between 0 and 1
        System.out.println(result);


        /**
         *      Math.round(float) => nearest INTEGER number
         *      Math.round(double) => nearest LONG number
         *
         *      Pass a float to .round() returns an INT
         *      pass a double to .round() return a LONG
         *
         */
        double PI = 3.14;
        long longX = Math.round(PI);

        float eN = 2.71f;
        int intX = Math.round(eN);



        /**
         *      the Math.pow()
         *
         *    ALWAYS returns a DOUBLE value
         *
         */

        double num = 2L;
        double exp = 3L;

        result = Math.pow(num, exp); // 8.0
        System.out.println(result);


        /**
         *      the Math.min() & Math.max()
         *
         *      there are 4 overloaded method for .min() and .max()
         *      One for each type: int, long, float,double
         *
         */

        int intA = 3;
        int intB = 4;

        int intMin = Math.min(intA, intB); // 3
        int intMax = Math.max(intA, intB); // 3









    }
}
