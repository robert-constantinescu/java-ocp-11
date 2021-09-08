package dExceptionHandling.m5;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(20);

        System.out.println(p.getAge());

        p.setAge1(25);

        //throws a checked exception. Does not compile
//        p.setAge2(10);

        // we handle the exception in the method
        increaseAge(p, 30);

        //throws a checked exception. Does not compile
        // we need to handle it
        // you can also pass it further to the main method. It will compile
        // but you basically say: "i don't care i the program crashes"
//        increaseAge2(p, 50);
    }


    //Option 1
    // Wrap it in a try-catch block in this method
    static void increaseAge( Person p, int age) {
        try {
            p.setAge2(10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Option 2
    // Decide that this is not the job of this method, and rethrow it
    static void increaseAge2( Person p, int age) throws IOException {
        p.setAge2(10);
    }
}

