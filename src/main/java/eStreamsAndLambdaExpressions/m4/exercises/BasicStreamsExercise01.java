package eStreamsAndLambdaExpressions.m4.exercises;


import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamsExercise01 {

    /**
     * Exercise 1: In a list of products, find the products that are in the category UTENSILS and sort them by name.
     *
     * @param products A list of products.
     * @return A list of products that are utensils, sorted by name.
     */
    public List<Product> findUtensilsSortedByName(List<Product> products) {
        // TODO: Add three stream operation methods:
        return products.stream()
        // 1) Find the products that are in the category UTENSILS
        .filter(product -> product.getCategory() == Category.UTENSILS)
        // 2) Sort them by name
        .sorted(Comparator.comparing(Product::getName))
        // 3) Collect the result into a List
        .collect(Collectors.toList());
        //
        // Hint: Use the API documentation of interface java.util.stream.Stream.

//        return products.stream()...;

//        throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }
}
