package gJavaIOApi.m4ReadWrite.Characters.writer;

import java.io.*;

public class Ex01PlayWithWriter {

    public static void main(String[] args) {


        // a WRITER needs to be FLUSHED
        // closing a WRITER also FLUSH the writer
        try (Writer writer = new FileWriter("files/words.txt");
                Reader reader = new FileReader("files/sonnet.txt")
        ) {
            char[] readBuf = new char[16];

            int noCharsRead = reader.read(readBuf);

            while (noCharsRead > 0) {

                System.out.println(readBuf);
                writer.write(readBuf,0, noCharsRead);
                noCharsRead = reader.read(readBuf);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
