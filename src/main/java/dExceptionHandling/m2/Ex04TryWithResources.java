package dExceptionHandling.m2;

import java.io.*;

public class Ex04TryWithResources {

    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("readme.md");
                FileOutputStream out = new FileOutputStream("out.txt")) {

            out.write(in.readAllBytes());
            System.out.println("z");

        }
    }
}
