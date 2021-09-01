package eStreamsAndLambdaExpressions.m4;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.util.List;
import java.util.stream.Stream;

public class Example01BasicStreams {


    public static void main(String[] args) {


        List<Product> products = ExampleData.getProducts();

        /*
                running the below example will provide no output, (WITHOUT THE TERMINAL OPERATION)
                because map() it's an INTERMEDIATE OPERATION and NOT TERMINAL OPERATION
         */
        Stream<Product> stream = products.stream().map(
                product -> {
                    System.out.println(product);
                    return product;
                });

        /*
            a TERMINAL operation is needed, for the stream to be called
            empty lambda, because there is nothing needed on the last step

         */
        stream.forEach(product-> {});

    }

}
