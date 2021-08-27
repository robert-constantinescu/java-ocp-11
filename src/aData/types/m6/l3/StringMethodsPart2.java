package aData.types.m6.l3;

import java.util.Locale;

public class StringMethodsPart2 {

    public static void main(String[] args) {
        System.out.println("\n** String Methods, Part 2 **\n");

        String str = "Hello World!";
        Character chr = str.charAt(1); // 'e'
        System.out.println(chr);

        str = "Mississippi";
        /*
                .indexOf()
                     return first occurrence of a character
                     if not match, return -1
         */
        int index = str.indexOf('s'); //2
        System.out.println(index);

        index = str.indexOf("is"); // 1, meaning that the FIRST occurrence STARTS at POSITION 1
        System.out.println(index);

        index = str.indexOf('i', 5); // tels to start the search from index 5 (inclusive)
        System.out.println(index); //7

        index = str.indexOf("ss", 4); // if you give him a negative number for the index, it defaults to index 0
        System.out.println(index); //5



        str = "Mississippi";
        /* return a NEW STRING(new reference), that is a subset of the original string.
         *
         */
        String subStr = str.substring(8); // NEW STRING from index 8 to end (str.length())
        subStr = str.substring(5, 8); //NEW STRING from index 5 to 7


        str = "MISSISSIPPI";
        /*
         *    .replace('I', 'x')
         * -  replace all occurrences of 'I' with 'x'.
         * -  It does not change the ORIGINAL string
         */
        String str2 = str.replace('I', 'x');
        System.out.println(str2);

        str2 = str.replace("SS", "xx"); //replace all occurrences of the "SS" with "xx"
        System.out.println(str2);


        str = new String("  Hi there!  "); //
        str2 = str.strip();
        String str3 = str2.replace("Hi", "Hello");
        String str4 = str3.toUpperCase();

        /*   METHOD CHAINING */
        str = "      Hi there!   ";
        str2 = str.strip().replace("Hi", "Hello").toUpperCase();

    }




}

