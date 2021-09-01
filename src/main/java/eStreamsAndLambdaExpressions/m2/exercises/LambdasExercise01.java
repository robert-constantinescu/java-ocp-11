package eStreamsAndLambdaExpressions.m2.exercises;


import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.Product;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasExercise01 {

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        Comparator<String> compareStringsAsInt = Comparator.comparing(Integer::valueOf);
        List<String> sorted;
        sorted = unsorted.stream().sorted(String::compareTo).collect(Collectors.toList());

        Long n3 = Long.valueOf("31415926535897932384626433832795");
        return sorted;


    }

    /**
     * Exercise 1: Sort a list of products by name using a lambda expression.
     *
     * @param products The list of products to sort.
     */
    public void sortProductsByName(List<Product> products) throws IllegalAccessException, NoSuchFieldException {
        // TODO: Use a lambda expression to sort the list of products by name

        /*
                lambda as an argument
         */
//        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));


        /*
                Comparator ar an argument

        Comparator<Product> productComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        products.sort(productComparator);
        */


        /*
                  Comparator static comparing() method +  method reference
         */
        products.sort(Comparator.comparing(Product::getName));



        /**/
        Product product = new Product(Category.FOOD, "Bulgur", new BigDecimal("5.00"));
        Product product2 = new Product(Category.OFFICE, "Pix", new BigDecimal("7.00"));

        Class<?> prodClass = product.getClass();
        Field nameField1 = prodClass.getDeclaredField("name");
        System.out.println("nameField1 hashcode: " + System.identityHashCode(nameField1));

        Class<?> prodClass2 = product2.getClass();
        Field nameField2 = prodClass2.getDeclaredField("name");
        System.out.println("nameField2 hashcode: " + System.identityHashCode(nameField2));

        System.out.println(prodClass.getDeclaredField("name") == prodClass2.getDeclaredField("name"));

        List<String> test;

    }
}
