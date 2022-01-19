package gJavaIOApi.m4ReadWrite.Bytes.read;

import java.io.*;

public class Ex01ReadingCharsFromInputStream {

    // this needs more research. Why does it need to go through 3 streams?
    public static void main(String[] args) {

        String hello = "Hello world";

        //ByteArrayOutputStream is an extension of OutputStream that allows
        //   -  the writing of bytes in a memory array

        ByteArrayOutputStream buffer = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             OutputStreamWriter writer = new OutputStreamWriter(bos)) {
            writer.write(hello);
            buffer = bos;

        } catch (IOException e) {
            e.printStackTrace();
        }



        System.out.println(buffer.toString());
        byte[] bytes = buffer.toByteArray();
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
             InputStreamReader isr = new InputStreamReader(bis);
        ) {
            System.out.println("S= " + isr.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
