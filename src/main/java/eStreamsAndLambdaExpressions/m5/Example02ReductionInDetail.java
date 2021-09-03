package eStreamsAndLambdaExpressions.m5;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Example02ReductionInDetail {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();


        Optional<BigDecimal> sumOfPricesOptional = products.stream()
                .map(Product::getPrice)
                // this parameters that this 'reduce' method is taking is a a BinaryOperator
                // here we are adding the elements using a BinaryOperator
                //              - for BinaryOperator, the types of it's params and return value are all the SAME
                //
                // the 2 values that we are passing to the BinaryOperator, are the subtotal and the next element
                .reduce(
                        (subTotal, next) -> subTotal.add(next)// this can be replaced with method reference)
                );// the reduce() will return an Optional:
                  //       - that contain the sum,
                  //       - or an empty Optional if the stream was empty

        sumOfPricesOptional.ifPresentOrElse(
                total -> System.out.println("The total sum is : " + total),
                () -> System.out.println("There are no products")
        );


        BigDecimal totalSum = products.stream()
                .map(Product::getPrice)
                // the second version of the reduce method, takes 2 parameters
                //      the difference is:
                //             - that the first parameter is the initial value for the final result
                //                  (from where to start the adding. In this example we start from 0 )
                //             - it returns just a value, and NOT an Optional
                //                  (if the stream is empty, the initial value is returned)
                //  the second parameter is a BinaryOperator
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("The total sum is : " + totalSum);


        BigDecimal anotherTotal = products.stream()
                /*
         it returns a value of some type U, instead of T(where T is the type of the elements in the stream)
         in other words, what this version returns may be a value
                              THAT is of a DIFFERENT TYPE than THE ELEMENTS in the STREAM
          it takes 3 parameters
               - the first is just like the second version, EXCEPT
                    - that instead that this value is of type U(instead of T)
               - the second parameter is a BiFunction that does the accumulation operation,
                    - just like the BinaryOperator in the first 2 methods
                    - the 2 parameter of this BiFunction:
                                    - intermediate results(subtotal)
                                    - and a stream element
                    - it has to return a new intermediate result
                    - it's a BiFunction and NOT a BinaryOperator, because the types of it's 2 params differ
               - the final parameter it's a combiner function
                    - which is a BinaryOperator, that knows how to combine 2 intermediate results to a single result
                    - the main reasons this is useful is for PARALLEL STREAMS:
                            - a parallel stream may use multiple threads to reduce part of the elements concurrently
                            in different threads, but in the end it will need to combine all in a SINGLE final result
                */
                .reduce(
                        BigDecimal.ZERO,
                        (result, product) -> result.add(product.getPrice()),
                        BigDecimal::add
                );
        System.out.println("The total sum is : " + anotherTotal);



    }
}
