package gJavaIOApi.m4ReadWrite.Characters.buffering.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01PlayWithBufferedWriter {

    public static void main(String[] args) {


        // in this example, the close() method will be called only for the FileWriter
        // so the BufferedWriter will not be closed and FLUSHED

        //BETTER would be to have the BufferedWriter in the try() argument
        try (FileWriter fileWriter = new FileWriter("files/words.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Writing with a BufferedWriter");

            // a BufferedWRITER should ALWAYS be FLUSHED MANUALLY
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
