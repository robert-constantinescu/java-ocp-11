package bControlling.program.flow.m3.l6;

public class SwitchSupportedVALUES {
    public static void main(String[] args) {
        int iVal = 10;
        final byte evenValue = 0;

        switch (iVal % 2) {
            case evenValue:
                System.out.println("even");
                break;
            case evenValue + 1:
                System.out.println("odd");
                break;
        }
    }
}
