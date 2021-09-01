package eStreamsAndLambdaExpressions.m3;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example04FunctionalComposition {

    static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate) {
        for (Product product : products) {
            if (predicate.test(product)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }


    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("2.00");

        Predicate<Product> isFood = product -> product.getCategory() == Category.FOOD;
        Predicate<Product> isCheap = product -> product.getPrice().compareTo(priceLimit) < 0;

        Predicate<Product> isFoodAndCheap = isFood.and(isCheap);

        findProduct(products, isFoodAndCheap)
                .ifPresentOrElse(
                        product -> System.out.printf("%s is cheap food for $%.2f%n", product.getName(), product.getPrice()),
                        () -> System.out.println("Everything is expensive")
                );


        List<String> test = new ArrayList<>();
        test.add("12");
        test.add("13");
        test.add("15");
    }
}
