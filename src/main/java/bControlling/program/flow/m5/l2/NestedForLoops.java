package bControlling.program.flow.m5.l2;

public class NestedForLoops {
    public static void main(String[] args) {

        /*  ============  Nested CLASSIC FOR    ================*/
        System.out.println(" /*  ============  Nested CLASSIC FOR    ================*/");
        int[][] multi = {
                {100, 105, 110},
                {200, 205, 210},
                {300, 305, 310}
        };

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.println(multi[i][j]);
            }
        }

        System.out.println();
        System.out.println();

        /*  ============  Nested FOR-EACH    ================*/
        System.out.println("/*  ============  Nested FOR-EACH    ================*/");
        for (int[] array : multi) {
            for (int i: array) {
                System.out.println(i);
            }
        }

    }

}

