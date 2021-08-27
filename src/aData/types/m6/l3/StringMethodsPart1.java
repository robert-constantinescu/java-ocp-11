package aData.types.m6.l3;

import java.util.Locale;

public class StringMethodsPart1 {

    /**
     *   .length() method, will return the number of chars in a string:
     *         - whitespaces
     *         - tabs (\t) = 1 char
     *         - new line (\n) = 1 char
     *         - escape characters are also counted (\") = 1char
     *
     *       are CASE SENSITIVE:
     *         - .startsWith()
     *         - .endsWith()
     *         - .contains()
     *
     *      .trim() removes:
     *         - all white spaces chars from the beginning and the end of string
     *         - new line -   (\n)
     *         - tabs         (\t)
     *         - backspaces - (\b)
     *         - escape characters ????
     *         - carriage return etc
     *
     *      .strip()   -   ONLY REMOVE WHITE SPACES
     *      .stripLeading();  - same as .strip(), focus on LEADING chars
     *      .stripTrailing(); - same as .strip(), focus on TRAILING chars
     *
     *
     */

    public static void main(String[] args) {
        System.out.println("\n** String Methods, Part 1 **\n");

        String str = new String("Hello World"); // dif reference
        String str2 = new String("Hello World");

        System.out.println(str == str); //false => because different instances(references) of the same type for creating String using 'new'
        str.equals(str2); // true => because .equals() compare the characters

        String str3 = "hello World!";
        str.equals(str3); // false
        str.equalsIgnoreCase(str3); //true

        str.length(); //12

        str = "\tHello \"cruel\" World!\n";
        str.length();//22 => escape characters are also considered
        System.out.println(str.length());

        str = "Hello World!";
        str2 = str.toUpperCase(); // "HELLO WORLD!"
        str3 = str.toLowerCase(); // "hello world!"

        /*      .startsWith()
         *      .endsWith()
         *      .contains()
         *
         *      are CASE SENSITIVE
         *
         */
        str = "To be, or not to be";
        str.startsWith("To"); // true
        str.startsWith("TO"); // false
        System.out.println(str.startsWith("TO"));

        str.endsWith("be"); //true
        str.endsWith("Be"); //false


        str2 = "Hello, i would like a Tesla";
        str.contains("Tesl"); //true
        str.contains("TeslA"); //false

        str = " Hi there! ";
        /*
        *           .trim() removes from the beginning and the end of string:
        *        - all white spaces chars from the beginning and the end of string
        *        - new line - \n
        *        - tabs    - \t
        *        - backspaces - \b
        *        - carriage return etc
        *
        * */
        str2 = str.trim(); //"Hi there"
        System.out.println(str2);

        str = "\t\b    \"Hi there\"  \\\r\n\f";
        str2 = str.strip(); // ONLY REMOVE SPACES
        str3 = str.trim();
        System.out.println(str2);
        System.out.println(str3);

        String str4 = str.stripLeading();
        String str5 = str.stripTrailing();

    }




}

