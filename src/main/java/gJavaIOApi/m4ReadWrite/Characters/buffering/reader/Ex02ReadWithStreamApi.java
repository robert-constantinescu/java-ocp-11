package gJavaIOApi.m4ReadWrite.Characters.buffering.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex02ReadWithStreamApi {

    public static void main(String[] args) {


        Path filePath = Path.of("files/sonnet.txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {

            Stream<String> lines = bufferedReader.lines();
            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
