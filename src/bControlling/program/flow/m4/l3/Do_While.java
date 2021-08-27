package bControlling.program.flow.m4.l3;

public class Do_While {

    public static void main(String[] args) {
        int iVal = 80;

        do {
            System.out.println(iVal + " * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);
    }
}
