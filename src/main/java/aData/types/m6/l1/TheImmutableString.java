package aData.types.m6.l1;

public class TheImmutableString {

    /**
     *      The STRING object encapsulates an ARRAY of CHAR
     *      The STRING object is IMMUTABLE, you CAN NOT:
     *          - ADD
     *          - REMOVE
     *          - or SUBSTITUTE chars in a STRING
     *
     *      To IMPROVE performance, the JVM provides a STRING LITERAL POOL
     *          - When a string literal is DECLARED, the JVM adds it to the POOL
     *          - If you'll create another STRING with EXACTLY the SAME CHARS,the JVM would use the LITERAL in the POOL,
     *          rather THAN CREATING a NEW INSTANCE
     *
     *          - The POOL is only USED for String literals( String str = "a string"), if you create a String using the
     *          new String("a string"), even if it has the EXACT same CHARS,
     *          the JVM will CREATE a new STRING INSTANCE and REFERENCE
     *
     *
     *
     */

    public static void main(String[] args) {

        System.out.println("\n**  Immutable Strings **\n");

        /*
        *       You can CREATE a STRING by USING LITERALS.
        *       The ONLY other TYPES that can be CREATED using LITERALS are PRIMITIVES
        */
        String str = "Hello!";
        String str2 = "Hello!";
        System.out.println(str == str2); // true => str and str2, have a REFERENCE to the SAME object

        /* if you create a String using the 'new String("a string")', the JVM will CREATE a new STRING INSTANCE and REFERENCE*/
        String str3 = new String("Hello!");
        System.out.println(str == str3); // false => they have the SAME CHARS, but NOT the SAME REFERENCE

        /* Same as ABOVE applies when creating a new string using the .substring() method*/
        String str4 = str.substring(5);
        String str5 = str.substring(5);
        System.out.println(str4 == str5); //false


    }

}
