package bControlling.program.flow.m4.l2;

public class WhileLoop {

    public static void main(String[] args) {


        int someValue = 65;
        long factorial = 1L;

        while ( someValue > 1) {
            factorial *= someValue;
            someValue--;
        }

        System.out.println(factorial);
    }
}
