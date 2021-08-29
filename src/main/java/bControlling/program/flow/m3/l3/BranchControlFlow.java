package bControlling.program.flow.m3.l3;

public class BranchControlFlow {

    public static void main(String[] args) {

        String valueName = "one";
        int total = 10;

        switch (valueName) {
            case "one":
                total += 1;

            case "two":
                total += 2;

        }

        System.out.println(total);

    }
}
