package aData.types.m3.l4;

import java.util.Date;

public class RelationalOperators {

    public static void main(String[] args) {
        System.out.println("\n ** Relational Operators **");

        int xInt = 3;
        boolean flag = false;
        String obj = "This is an Object";

//        xInt < flag;  // won't compile
//        xInt < obj;   // won't compile

        boolean result;
        xInt = 3;
        float zFloat = 3.1f;
        result = xInt == zFloat; //false
        result = xInt == zFloat; //true


        boolean isFalse = false;
        boolean isTrue = true;
        result = isFalse == isFalse; //false
        result = isTrue != isFalse;  //true



        // This example compares OBJECT references
        Date dateA = new Date(0L); // Wed Dec 31 18:00:00 CST 1969
        Date dateB = dateA;
        Date dateC = new Date(0L); // Wed Dec 31 18:00:00 CST 1969

        result = dateA == dateB; //true because they reference the SAME OBJECT in memory
        result = dateA != dateC; //true because they reference DIFFERENT INSTANCES of an OBJECT. It does not matter that is the same date


        class ClassA {};
        class ClassB extends ClassA {};

        ClassA instanceA = new ClassA();
        ClassB instanceB = new ClassB();

        result = (instanceA instanceof ClassA); //true  => because instanceA is the ClassA
        result = (instanceB instanceof ClassA); //true  => because instanceB is a subclass of ClassA
        result = (instanceA instanceof ClassB); //false  => because instanceA is a SUPERCLASS of ClassB, NOT a SUBCLASS


    }
}
