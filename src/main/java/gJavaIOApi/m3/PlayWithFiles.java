package gJavaIOApi.m3;

import java.io.File;
import java.io.IOException;

public class PlayWithFiles {


    public static void main(String[] args) throws IOException {
        //When using relative paths, the current directory is the root directory of the project
        File file = new File("files/sonnet.txt");
        System.out.println(file);
        file.createNewFile();

        System.out.println(file.getAbsolutePath());
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());

    }
}
