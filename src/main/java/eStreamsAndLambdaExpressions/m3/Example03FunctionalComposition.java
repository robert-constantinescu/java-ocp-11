package eStreamsAndLambdaExpressions.m3;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example03FunctionalComposition {

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

        String name = "Spaghetti";

        Function<Product, BigDecimal> productToPrice = Product::getPrice;
        Function<BigDecimal, PrintStream> priceToMessage = price -> System.out.printf("The price of %s is $ %.2f", name, price);

        // here we combine the 2 functions from above into one function
        Function<Product, PrintStream> productToMessage = productToPrice.andThen(priceToMessage);
        // this does the same as the above, but in reverse
        Function<Product, PrintStream> productToMessageWithCompose = priceToMessage.compose(productToPrice);

        //same as below but with function references
        findProduct(products, prod -> prod.getName().equals(name))
                // we use the function we created by composing other 2 functions
                .map(productToMessage)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.printf("Product %s NOT AVAILABLE", name)
                );


        findProduct(products, prod -> prod.getName().equals(name))
                // first we transform the Product to a price
                .map(productToPrice)
                // then we transform the price to the message that we want to print
                .map(priceToMessage)
                // the ifPresentOrElse, will receive as first argument the message that we want to print from the map() function
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.printf("Product %s NOT AVAILABLE", name)
                );


    }
}
