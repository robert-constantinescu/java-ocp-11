package dExceptionHandling.m5;

import java.io.IOException;

public class Person {

    int age;

    public void setAge(int age) {
        this.age = age;
    }

    //unchecked exception
    public void setAge1(int age) throws IllegalArgumentException{
        if (age <= 0) {
            throw new IllegalArgumentException("...");
        }
        this.age = age;
    }


    //checked exception
    public void setAge2(int age) throws IOException {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
