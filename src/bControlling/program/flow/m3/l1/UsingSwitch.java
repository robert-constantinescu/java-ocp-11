package bControlling.program.flow.m3.l1;

public class UsingSwitch {

    public static void main(String[] args) {
        char sign = '-';
        switch (sign) {
            case '+':
                System.out.println("POSITIVE");
                break;
            case '-':
                System.out.println("NEGATIVE");
                break;
                /*          COMPILE ERROR. TWO IDENTICAL LABELS */
//            case '-':
//                System.out.println("NEGATIVE");
//                break;
            default:
                System.out.println("SIGN NOT RECOGNIZED");
                break;
        }
    }
}
