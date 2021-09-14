package eStreamsAndLambdaExpressions.m4.exercises;

import eStreamsAndLambdaExpressions.setup.Product;

import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamsExercise06 {

    /**
     * Exercise 6: Format a list of products into a string, with one product per line.
     *
     * @param products A list of products.
     * @return A string containing the products as strings, separated by newlines ('\n').
     */
    public String formatProductList(List<Product> products) {
        // TODO: Convert each of the products to a string (using Product.toString()) and collect the results in a string.
        return products.stream()
                // Separate the products strings by a newline character '\n'.
                .map(product -> product.toString() + "")
                // Hint: Use the appropriate collector in the last step to convert the product strings into a single string.
                .collect(Collectors.joining("\n"));

//        throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }
}
