package eStreamsAndLambdaExpressions.m2;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;

public class Example1CapturingVariables {

    interface ProductFilter {
        // this methods returns a boolean, that indicates whether the product meets whatever criteria we want to use
        boolean accept(Product product);
    }

    // one option is to create a method
    static void printProductsV1(List<Product> products, BigDecimal priceLimit) {
        for (Product product : products) {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                System.out.println(product);
            }
        }
    }

    // one option is to create a method
    static void printProductsV2(List<Product> products, ProductFilter productFilter) {
        for (Product product : products) {
            if (productFilter.accept(product)) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        // use a method
        printProductsV1(products, priceLimit);

        /*
            the captured variable 'priceLimit' must be final or effectively final
            this is basically an implementation of accept(): product.getPrice().compareTo(priceLimit) < 0;

         */
        ProductFilter filter = product -> product.getPrice().compareTo(priceLimit) < 0;
        /*
             we pass the filter declared above as an argument,
             and then in the printProductsV2(), we call the accept() methods on the filter object
         */
        printProductsV2(products, filter);





    }
}
