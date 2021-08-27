package bControlling.program.flow.m4.l4;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i *= 2 ) {
            System.out.println(i);
        }

        int factorial = 1;
        for (int num = 3; num > 1; num--) {
            factorial *= num;
            System.out.println(num + " | " + factorial);
        }

        System.out.println("Result: " + factorial);
    }
}
