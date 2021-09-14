package eStreamsAndLambdaExpressions.m4.exercises;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;

public class BasicStreamsExercise05 {

    /**
     * Exercise 5: Check if all office products in the given list of products cost less than a price limit.
     *
     * @param products   A list of products.
     * @param priceLimit The price limit.
     * @return {@code true} if all products in the category OFFICE in the list cost less than the price limit,
     * {@code false} otherwise.
     */
    public boolean areAllOfficeProductsCheap(List<Product> products, BigDecimal priceLimit) {
        // TODO: Look for products in the category OFFICE. Check if all of them cost less than the price limit.
        return products.stream()
//        Use two stream operations; one the find the appropriate products,
                .filter(product -> product.getCategory() == Category.OFFICE)
//        and another one to check if they all cost less than the price limit.
                .allMatch(product -> product.getPrice().compareTo(priceLimit) <=0 );
        //
        // Hint: Use two stream operations; one the find the appropriate products,
        // and another one to check if they all cost less than the price limit.

//        throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }
}
