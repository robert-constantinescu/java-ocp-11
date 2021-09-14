package eStreamsAndLambdaExpressions.m5.exercises;

import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExercise03 {

    public enum PriceRange {
        CHEAP, MEDIUM, EXPENSIVE
    }

    /**
     * Exercise 3: Group products by price range.
     *
     * @param products       A list of products.
     * @param cheapLimit     Products cheaper than this are considered cheap.
     * @param expensiveLimit Products more expensive than this are considered expensive.
     * @return A map containing the cheap, medium and expensive products in separate lists.
     */
    public Map<PriceRange, List<Product>> groupProductsByPriceRange(List<Product> products, BigDecimal cheapLimit, BigDecimal expensiveLimit) {
        // TODO: Group products by price range.
        //
        // - A product is CHEAP if its price is less than cheapLimit.
        // - A product is EXPENSIVE if its price is more than expensiveLimit.
        // - A product is MEDIUM if its price is between cheapLimit and expensiveLimit.
        Map<BigDecimal, List<Product>> collect = products.stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getPrice,
                                Collectors.filtering(
                                        product -> product.getPrice().compareTo(expensiveLimit) >= 0,
                                        Collectors.toList()
                                )
                        )
                );

        System.out.println(collect);

        //
        // Hint: Look carefully at the type of the keys of the map that this method should return. It tells you something about the classifier function.
        // What relation does this have with the classifier function that you use when using a grouping operation?

//        return products.stream()...;

        throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }
}
