package scratch;

import java.io.IOException;

public class Main {

    public static boolean check() {
        return true;
    }
    public static void main(String[] args) {

        if(check()) {
            throw new RuntimeException();
        }

        try {

            System.out.println("x");
        }
        catch (NumberFormatException ex) { }
        catch (IllegalArgumentException ex) { }
        catch (RuntimeException ex) { }


    }
}
