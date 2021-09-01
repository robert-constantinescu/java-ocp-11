package eStreamsAndLambdaExpressions.m4;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Example03FilterAndTransform {


    public static void main(String[] args) {


        List<Product> products = ExampleData.getProducts();

        //filtering a stream
        products.stream()
                .filter( product -> product.getCategory() == Category.FOOD)
                .forEach(System.out::println);


        //transform the stream
        products.stream()
                // map does a ONE TO ONE transformation and returns a Stream<Product>      IMPORTANT!!!
                // we transform the stream of Products into a stream of Strings
                // map takes a function that takes an input element and returns a single value
                .map(product -> String.format("The price of %s is $ %.2f", product.getName(), product.getPrice()))
                .forEach(System.out::println);


        //transform the stream
        Pattern spaces = Pattern.compile("\\s+");
//        Stream<String> streamFlatMap =
                products.stream()
                // flatMap does a ONE TO MANY transformation       IMPORTANT!!!
                // the function that we pass to flatMap, gets each of the products as input,
                        // and must return a Stream as it's result
                // here, the names for some of the products, contains multiple words,
                        // and for some products, it will return multiple strings
                // the splitAsStream() will return the words as a Stream<Strings>
                        // flatMap takes a function that takes an input element and returns multiple values
                .flatMap(product -> spaces.splitAsStream(product.getName()))
                // if we had used map, we would have a Stream<Stream<Product>>
                .forEach(System.out::println);



        Stream<Stream<String>> streamMap = products.stream()
                // the word flat in the flatMap, refers to the fact that it will flatten these Stream<Stream<String>>
                // and only return Stream<String>
                // if we had used map, we would have a Stream<Stream<Product>>
                .map(product -> spaces.splitAsStream(product.getName()));


    }

}
