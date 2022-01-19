package gJavaIOApi.m4ReadWrite.Characters.buffering.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex02BufferedWriterJavaNIO {

    public static void main(String[] args) {


        Path path = Path.of("files/words.txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path))
        {
            bufferedWriter.write("NIO - Writing with a BufferedWriter");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
