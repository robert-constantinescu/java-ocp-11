package gJavaIOApi.m4.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01PlayWithReader {

    public static void main(String[] args) {

        //Reader is an abstract class, and we need to find a concrete class to use it
        try {
            Reader reader = new FileReader("files/sonnet.txt");

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

            // don't forget ro close the reader
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
