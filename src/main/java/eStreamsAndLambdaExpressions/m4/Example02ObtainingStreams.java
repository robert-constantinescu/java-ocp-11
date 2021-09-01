package eStreamsAndLambdaExpressions.m4;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example02ObtainingStreams {


    public static void main(String[] args) {


        List<Product> products = ExampleData.getProducts();

        //getting a Stream from a list
        Stream<Product> stream1 = products.stream();

        //getting a Stream from an array
        String[] array = new String[]{"one", "two", "tree"};
        Stream<String> stream2 = Arrays.stream(array);


        // Using Stream factory methods
        Stream<String> stream3 = Stream.of("one", "two", "tree");

        //this method takes a single argument and returns:
        //          - empty stream if the argument is null
        //          - stream containing a single element if the argument is not null
        Stream<String> stream4 = Stream.ofNullable("four");


        // creating an empty stream
        Stream<?> stream5 = Stream.empty();


        //this returns an infinite stream of random numbers
        IntStream dice = new Random().ints(1, 7);


        try(BufferedReader in = new BufferedReader(new FileReader("README.md", StandardCharsets.UTF_8))) {
            in.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

}
