package bControlling.program.flow.m3.l5;

public class SwitchSupportedTypes {

    public static void main(String[] args) {
        Day today = Day.SUN;

        /* the BELOW would be a PERFECTLY VALID CODE*/
        switch (today) {
            case SAT:
            case SUN:
                System.out.println("Weekend");
                break;
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Weekday");
                break;
        }

        /* BUT FOR SIMPLICITY, WE CAN DO LIKE THIS*/
        switch (today) {
            case SAT:
            case SUN:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
                break;
        }

    }
}
