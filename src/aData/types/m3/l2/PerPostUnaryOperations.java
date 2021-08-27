package aData.types.m3.l2;

public class PerPostUnaryOperations {

    public static void main(String[] args) {
        System.out.println("\n** Pre-/Post-Unary Operators ** \n");

        int xInt = 1;

        /**
         *      PRE UNARY operator, incrementing variable
         */
        ++xInt; //2
        --xInt; //1


        double xDouble = 3.14;

        ++xDouble; //4.14
        --xDouble; //3.14


        /**
         *  this is also a valid expression
         *
         *  Below operation step by step:
         *  Left to right:
         *      1. xInt is increased by 1, to 5
         *      2. yInt does not change
         *      3. zInt decreases to 2
         *    The PRE UNARY operator change the values of the variables in place, as the operation is executed
         */
        xInt = 4;
        int yInt = 7;
        int zInt = 3;

        int result = ++xInt + yInt * --zInt;

        System.out.println(result);

        xInt = 5;

        result = ++xInt + xInt + ++xInt;
        //         6        6        7
        //         6    +   6   +    7  = 19

        System.out.println(result);


        /**
         *      POST UNARY OPERATORS
         *
         *      The thing to remember is that the POST UNARY operators, are not EXECUTED until AFTER the OPERATION is executed
         *      1. The firs xInt, is 1. Then it increments and goes to the 2nd one
         *      2. The second xInt is 2. It does not happen anything with it
         *      3. The third xInt, will stay 2, until the addition is performed, and then it will increment xInt to 3, after the calculation
         *      The last operation, increments the xInt, after it's used
         *
         *
         */

        xInt = 1;
        result = xInt++ + xInt + xInt++;
        //         1       2       2


    }
}
