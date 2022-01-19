package gJavaIOApi.m4ReadWrite.Bytes;

import java.io.*;

public class Ex02ReadWriteObjects {

    public static void main(String[] args) {

        User u1 = new User("Richie", 23);
        User u2 = new User("Diana", 25);

        try (FileOutputStream fis = new FileOutputStream("files/users.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
        ) {

            //you CAN'T WRITE AN OBJECT that is NOT IMPLEMENTING SERIALIZABLE
            oos.writeObject(u1);
            oos.writeObject(u2);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (FileInputStream fis = new FileInputStream("files/users.bin");
             ObjectInputStream oos = new ObjectInputStream(fis);
        ) {

            //you CAN'T WRITE AN OBJECT that is NOT IMPLEMENTING SERIALIZABLE
            var x1 = oos.readObject();
            var x2 = oos.readObject();
            System.out.println(x1);
            System.out.println(x2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
