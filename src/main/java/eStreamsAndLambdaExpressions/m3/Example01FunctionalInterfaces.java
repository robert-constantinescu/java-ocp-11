package eStreamsAndLambdaExpressions.m3;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.awt.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Example01FunctionalInterfaces {

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
        findProduct(products, prod -> prod.getName().equals(name))
                // the map method takes a parameter(an instance of the Function interface):
                //          if the Optional contains a value, map will pass the value to the function, and returns a new Optional containing the output of the function
                //          or if the original Optional was empty, it will just return an empty Optional
                // in other words, the map() will transform the content of the Optional using the specified function

                /*
                                Below we transform the Optional<Product> that we get from findProduct(), to an
                         Optional that contains ONLY the PRICE of the product

                            The Object that getPrice will be called, is the first parameter of the function, which is the
                         Product object that's inside the Optional

                            After the map is applied, the original Optional<Product> has been transformed in an
                         Optional<BigDecimal>
                 */
                .map(Product::getPrice)
                /*
                     ifPresentOrElse() takes 2 parameters:
                           for the first parameter it takes an Consumer, which will be executed if there is something in the Optional
                           the second parameter a Runnable is for the case when the Optional is empty
                 */
                .ifPresentOrElse(
                        price -> System.out.printf("The price of %s is $ %.2f", name, price),
                        // Runnable is an interface with 0 inputs and 0 outputs
                        () -> System.out.printf("Product %s NOT AVAILABLE", name)
                );


    }
}
