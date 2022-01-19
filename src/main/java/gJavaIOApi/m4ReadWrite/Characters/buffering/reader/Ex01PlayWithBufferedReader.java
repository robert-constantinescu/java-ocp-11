package gJavaIOApi.m4ReadWrite.Characters.buffering.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex01PlayWithBufferedReader {

    public static void main(String[] args) {


        Path filePath = Path.of("files/sonnet.txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
