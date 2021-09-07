package scratch;

import java.io.FileNotFoundException;
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
            throw new IOException();
        }
        catch (FileNotFoundException ex) { }
        catch (RuntimeException ex) { }
        catch (IOException ex) { }



    }
}
