package gJavaIOApi.m4ReadWrite.Characters.reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Ex03MarkingTheStreamOfReadChars {

    public static void main(String[] args) {

        /*
            Marking and Resetting are supported by InMemory readers, like StringReader and CharArrayReader
            File Reader does not support marking
         */

        try ( Reader reader = new StringReader("files/sonnet.txt")){

            char[] buf = new char[16];

            int noOfReadChars = reader.read(buf);

            StringBuilder sb = new StringBuilder();
            while (noOfReadChars > 0) {
                sb.append(buf, 0, noOfReadChars);
                noOfReadChars = reader.read(buf);
            }

            System.out.println("sb = " + sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
