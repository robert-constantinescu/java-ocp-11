package aData.types.m3.l7;

public class OtherOperators {

    public static void main(String[] args) {
        System.out.println("\n** Other Operators ** \n");

        /* Plus and Minus UNARY Operators*/

        /* the positive and negative unary operators used with literals */
        int x = 5 * -3;       // -15
        double y = -6 + 9.13; // 3.13000


        /* positive and negative unary operators used with variables */
        x = 5;
        y = -x * -3 + +x;  // 20.0


        /* don't confusing positive/negative unary operators
        with pre-unary operators */
        x = 5;
        y = --x * -3 + ++x;  // -7


        /* don't be tricked by mixed use of positive/negative unary operators
        with pre-unary operators */
        x = 5;
        y = --x * -3 + -x;  // -16.0
    }
}
