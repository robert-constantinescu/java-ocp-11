package aData.types.m3.l8;

public class OrderOfOperations {

    public static void main(String[] args) {
        System.out.println("\n** Order Of Operations **\n");

        int x = 3;
        int y = 4;


        int z = x++ + y + --y + x;
        //       3    4    3    4
        //       3  + 4 +  3  + 4

        x = 3;
        y = 4;
        z = --x + -x + +y--; //y-- is executed after all the values are established
        //    2   -2    4    // firs we evaluate the double + & -
        //    2 +(-2) + 4


        x = 3;
        y = 4;
        z = x * x++ + y - y / x;
        //  3   3     4   4 / 4
        //  3 * 3     4   4 / 4
        //    9    +  4  -  1
        System.out.println(z);

    }
}
