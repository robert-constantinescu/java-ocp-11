package aData.types.m2.l4;

public class PrimitiveChars {

    public static void main(String[] args) {


        /**
         *      the char primitives is used ALMoST EXCLUSIVELY to represent unicode characters
         *
         *      but also can hold a range of INTEGRAL values, similar to the SHORT or INT
         *
         *      a UNICODE char is made up of 16 biti, the same as a short. But they are NOT THE SAME RANGE
         *
         *
         *      The most COMMON use of a CHAR is with character literals.
         *
         *      The char literal MUST be in SINGLE quotes. If you put DOUBLE quotes it becomes a string
         *
         *
         */

        //char RANGE
        char minChar = 0;
        char maxChar = 65535;

        System.out.println("\n** Primitive chars ** \n");

        System.out.println("Char Range: \nminChar: 0");
        System.out.println("maxChar: 65535\n" );

        char aLetter = 'A';
        char aUnicode = '\u0041';
        // Under the hood, UNICODE characters are STORED as INTEGRALS
        char aNumber = 65;


        if (aLetter == aUnicode && aUnicode == aNumber) {
            System.out.println(" \\u0041, 'A', and 65 are equal");
        } else {
            System.out.println(" They are NOT equal");
        }


        char sheenCharacter = '\u0634';

        System.out.println("Arabic 'sheen' = " + sheenCharacter);


        char defaultValue = 65;
        System.out.println(defaultValue);



    }
}

