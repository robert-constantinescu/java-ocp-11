package eStreamsAndLambdaExpressions.m5;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Example02Reducing {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();


        Optional<BigDecimal> sumOfPricesOptional = products.stream()
                .map(Product::getPrice)
                .reduce(
                        (subTotal, next) -> subTotal.add(next)// this can be replaced with method reference)
                );

        sumOfPricesOptional.ifPresentOrElse(
                total -> System.out.println("The total sum is : " + total),
                () -> System.out.println("There are no products")
        );


        BigDecimal totalSum = products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("The total sum is : " + totalSum);


        BigDecimal anotherTotal = products.stream()
                .reduce(
                        BigDecimal.ZERO,
                        (result, product) -> result.add(product.getPrice()),
                        BigDecimal::add
                );
        System.out.println("The total sum is : " + anotherTotal);



    }
}
