package gJavaIOApi.m4ReadWrite.Characters.writer;

import java.io.*;

public class Ex01StringWriter {

    public static void main(String[] args) {

        try (StringWriter writer = new StringWriter()) {

            writer.write("Hello world");

            writer.flush();

            // this will return the buffer where the string was created
            // the buffer helps the StringWriter to not directly create a String(that is an immutable object)
            // an immutable object can't be modified,
            //      so it will make the writer create a new String every time we write something to it.
            //this could lead to performance issues

            StringBuffer buffer = writer.getBuffer();
            String s = writer.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
