package aData.types.m2.l6;

public class Underscores {

    public static void main(String[] args) {
        System.out.println("\n** Underscores in Numbers ** \n");

        /**
         * Rule of thumb, underscores should be used only inside the number
         *
         *  at compile time, the underscores are JUST IGNORED.
         *
         *  THEIR PURPOSE is solely HUMAN READABILITY
         *
         *  underscores can be used in ANY of the INTEGRAL numbers but also in the DOUBLE an the FLOAT numbers
         *
         *  However it CAN NOT BE USED at the START or THE END of any PRIMITIVE NUMBER;
         *    short maxShort = _32767;
         *    short minShort = -32768;
         *
         */
        long worldPopulation = 7_674_000_000L;

        double Pi = 3.141_592_653_793_238d;


//        Examples that will not work

//        at the beginning or end of a number, including floats
//        short minShort = _32767;
//        short maxShort = -32768_;

//        double latitude = _48.8584d;
//        float longitude = 1.050f_;

//        long usPopulation = 328_200_000_l;
//        float specificGravity = 1.050f_;


//        after a decimal point
//        float kgInPounds = 2_.20462f;
//        double poundInKg = 0._45391830542594d;




    }
}
