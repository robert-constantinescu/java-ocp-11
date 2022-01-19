package gJavaIOApi.m4ReadWrite.Bytes.write;

import java.io.*;

public class Ex01PlayWithByteStream {

    public static void main(String[] args) {

        byte[] header = {0xC, 0xA, 0xF, 0xE, 0xB, 0xB, 0xE};

        try(OutputStream os = new FileOutputStream("files/data.bin")) {

            os.write(header);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(InputStream is = new FileInputStream("files/data.bin")) {

            byte[] readBytes = is.readAllBytes();
            for (byte bytes : readBytes) {
                System.out.printf("0x%x ", bytes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
