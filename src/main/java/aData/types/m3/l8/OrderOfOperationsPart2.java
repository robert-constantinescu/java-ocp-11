package aData.types.m3.l8;

public class OrderOfOperationsPart2 {

    public static void main(String[] args) {
        System.out.println("\n** Order Of Operations -  Part 2**\n");

        int x = 3, y =4;
        boolean zBool;

        zBool = y + x * x > y & y != ++x;
        //      4   3   3   4   4     4
        //      4  +  9     4   4     4
        //         13    >  4   4 !=  4
        //           true     &   false
        //                 false
        System.out.println(zBool);

        boolean xB = true;
        boolean yB = false;
        boolean zB = xB   &&   xB    ^   xB   ||   yB     |    xB;
                //   true     false  ^   true      false  |   true
                //   true    &&     true      ||        true
                //          true              ||        true
                //                       true


        x = 3;
        y = 6;
        int z = 2;

            z  *=  y / x - y - x > y ? 4 : 2;
        //  z      6 / 3   6   3   6   4 : 2
        //  z        2  - 6    3   6   4 : 2
        //  z          -4      3 > 6 ? 4 : 2
        //  z          -4                  2
        //  z          -4    -             2
        //  z          -6
        //  z *= -6
        //  z = z * -6
        //  z = 2 * -6
        //  z = -12


    }
}
