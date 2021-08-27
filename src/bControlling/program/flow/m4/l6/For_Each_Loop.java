package bControlling.program.flow.m4.l6;

public class For_Each_Loop {

    /*
           FOR EACH will work with any COLLECTION, and ANY TYPE that IMPLEMENTS the ITERABLE interface
     */
    public static void main(String[] args) {

        float[] vals = {10.0f, 20.0f, 15.0f};
        float sum = 0.0f;

        /* ==================         FOR EACH           ============*/
        for (float currentVal : vals) {
            sum += currentVal;
            System.out.println(sum);
        }
        System.out.println(sum);


        sum = 0.0f;
        /* ==================        CLASSIC FOR           ============*/
        for (int i = 0; i < vals.length; i++) {
            float currentVal = vals[i];
            sum += currentVal;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
