package aData.types.m6.l2;

public class StringConcatenation {

    /**
     *      STRING supports 2 of the PRIMITIVE OPERATORS:
     *              -  '+'
     *              -  '+='
     *
     *          These operators when APPLIED to a STRING REFERENCE ALLOWS you to CREATE a new STRING REFERENCE the is a CONCATENATION
     *      of the 2 ORIGINAL STRINGS
     *          It JOINS 2 strings to INSTANTIATE a NEW LONGER STRING
     *
     *
     */


    public static void main(String[] args) {
        System.out.println("\n** **\n");

        String str = "Hi, ";
        String str2 = str + "Bob!";
        System.out.println(str2); // "Hi, Bob!"

        String pi = "3.14" + 15926;
        System.out.println(pi);  // 3.1415926

        String str3 = 5 + 3 + "xyz" + 3 + 5;
        System.out.println(str3); // "8xyz35"

        String str4 = "Pi is ";
        str4 += "3.14";
        System.out.println(str4); // "Pi is 3.14"

        str4 += "__" + 5 * 4; // "Pi is 3.14__20"


    }
}
