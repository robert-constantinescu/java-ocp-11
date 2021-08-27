package aData.types.m3.l6;

public class TernaryOperator {


    public static void main(String[] args) {

        boolean result = false;

        System.out.println(result);

        float x = (float) Math.random() * 6;
        if (x <= 3) {
            result = true;
        }
        else {
            result = false;
        }


        /*   The TERNARY OPERATOR*/

        result = (x <= 3) ? true : false;

        String strValue = "The strValue is " + ((x <= 3) ? x : "to high");

    }
}
