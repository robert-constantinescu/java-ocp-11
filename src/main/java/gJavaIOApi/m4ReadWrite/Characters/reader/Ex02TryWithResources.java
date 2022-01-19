package gJavaIOApi.m4ReadWrite.Characters.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02TryWithResources {

    public static void main(String[] args) {

        //Reader is an abstract class, and we need to find a concrete class to use it
        //using TRY WITH RESOURCES, does not need an EXPLICIT close, because of the AutoCloseable interface.
        // EXISTING the TRY block, will CLOSE the resource used
        try ( Reader reader = new FileReader("files/sonnet.txt")){

            char[] buf = new char[16];

            /* the 'read()' method:
                - is reading characters from the FileReader and puts them in buffer
                - the return of the read() is the number of chars, that have been read by the buffer
                - it is possible,that it reads less than the size of the buffer(16)
                - as long as the returned integer is greater than 0, there are chars to be read from the file
            * */
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
