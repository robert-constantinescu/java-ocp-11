package dExceptionHandling.m1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01TryCatchSyntax {

    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("readme.md"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line );
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
