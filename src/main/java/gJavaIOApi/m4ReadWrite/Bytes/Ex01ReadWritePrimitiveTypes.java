package gJavaIOApi.m4ReadWrite.Bytes;

import org.junit.platform.commons.function.Try;

import java.io.*;
import java.util.Arrays;

public class Ex01ReadWritePrimitiveTypes {

    public static void main(String[] args) {

        int[] ints = {256, 512, 1024};
        byte[] bytes = {};

        try (ByteArrayOutputStream os = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(os)) {

            for (int i : ints) {
                dos.writeInt(i);
            }
            dos.flush();
            bytes = os.toByteArray();
//            System.out.println(Arrays.toString(bytes));


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            DataInputStream dis = new DataInputStream(bis);
        ) {

//            for (int i = 0; i < 5; i++) {
                byte read = dis.readByte();
                System.out.println(read);
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
