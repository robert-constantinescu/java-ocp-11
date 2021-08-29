package aData.types.m4.l1;

public class WrapperConversionMethods {

    public static void main(String[] args) {
        System.out.println("\n** Wrapper Conversion Methods **\n");

        Integer intWrapper = Integer.valueOf(7);

        byte byteVal = intWrapper.byteValue();       // 7
        short shortVal = intWrapper.shortValue();    // 7
        int intVal = intWrapper.intValue();          // 7
        long longVal = intWrapper.longValue();       // 7L
        float floatVal = intWrapper.floatValue();    // 7.0F
        double doubleVal = intWrapper.doubleValue(); // 7.0

        intWrapper = Integer.valueOf(200_000);
        shortVal = intWrapper.shortValue();  // this value will be unpredictable. In this case 3392.

        /*
                When you try to convert a DECIMAL to INTEGRAL. The decimal points will be discarded.
         */
        Double doubleWrapper = Double.valueOf(3.14);
        byteVal = doubleWrapper.byteValue(); //3

//        boolean boolValue = intWrapper.booleanValue();  // No .booleanValue() defined in any of the wrappers



        /*
                Parsing a String, as long as the String is a valid number
         */
        String strNum = "1234";
        intVal = Integer.parseInt(strNum);  //1234
        floatVal = Float.parseFloat(strNum); //1234.0f

//        try {

            shortVal = Short.parseShort("an invalid string number"); // throws a NumberFormatException
            intVal = Integer.parseInt("3.14");    // throws a NumberFormatException - trying to convert a DECIMAL to an INTEGRAL
            intVal = Integer.parseInt(null); // throws a NumberFormatException - trying to convert a DECIMAL to an INTEGRAL

//        } catch (NumberFormatException nfe) { System.out.println(nfe.getMessage());  }


        /*
                .parseBoolean() method is NOT CASE SENSITIVE
                Any invalid string, will not thrown an exception, but the .parseBoolean() return false
         */
        boolean boolValue = Boolean.parseBoolean("TRUE"); //true
        boolValue = Boolean.parseBoolean("false"); // false

        boolValue = Boolean.parseBoolean("anything other than true or false will be false ");// false
        boolValue = Boolean.parseBoolean(null);// false

    }
}
