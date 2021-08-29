package eStreamsAndLambdaExpressions.m2;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;

public class Example2CapturingVariables {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        int numberOfCheapProducts = 0;
        //using a for loop
        for (Product product : products) {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                numberOfCheapProducts++;
            }
        }

        System.out.println(numberOfCheapProducts + " cheap products");


        int numberOfCheapProductsV2 = 0;
        /*
        The below will not work, because numberOfCheapProductsV2 IS NOT EFFECTIVELY FINAL

        products.forEach(product -> {
            if (product.getPrice().compareTo(priceLimit) < 0)
                numberOfCheapProductsV2++;
        });

         */
    }
}
