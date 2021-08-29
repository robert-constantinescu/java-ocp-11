package bControlling.program.flow.m3.l4;

public class BranchOrder {

    public static void main(String[] args) {

        char operation = '+';
        int sum = 0;

        switch (operation) {
            case '-':
                System.out.println("Subtraction not allowed");
                break;
            case '+':
                sum++;
                System.out.println("Current sum: " + sum);
                break;
            default:
                System.out.println("Current sum: " + sum);
                break;
        }

        /* ANOTHER VALID WAY TO DO IT, and REMOVE the DUPLICATE print STATEMENT*/
        switch (operation) {
            case '+':
                sum++;


            default:
                System.out.println("Current sum: " + sum);
                break;
            case '-':
                System.out.println("Subtraction not allowed");
                break;
        }

    }
}
