package aData.types.m3.l8;

public class OrderOfOperationsPart3 {

    public static void main(String[] args) {
        System.out.println("\n** Order Of Operations -  Part 3**\n");

        int x = 3, y =4;
        int z = --x * x + y + 8;
          //z =   2 * 2   4   8
          //z =     4   + 4 + 8
          //z =  16
        System.out.println(z);

        x = 3;
        y = 4;
        z = --x * (x + y + 8);
        //=   2 * (2 + 4 + 8)
        //=   2 *  14
        //=  28
        System.out.println(z);

        x = 3;
        y = 4;
        z = 0;

        /* count the Open and Closed parenthesis, the number should be equal for the program to compile*/
        /* if they are equal, check if they are placed in an illegal position */
        z = (--x * x + (y + x) - y--);

        z = --x * ((x + y) + x) - y--;

        z = (--x * x + y + (x - y--));



    }
}
