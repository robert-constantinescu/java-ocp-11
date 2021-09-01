package eStreamsAndLambdaExpressions.m4;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public class Example04SearchingInStreams {


    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();


        // the differences between findFirst and findAny, matters only if the source of the stream is ordered
        // for example, in a HashSet, there is no specifically order of elements:
            //so findFirst will do the same thing as findAny

        Optional<Product> theProductOptional = products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                // in order to use findFirst, we need a filter method before it
                // findFirst is a terminal method and returns an Optional
                .findFirst();
        theProductOptional.ifPresent(System.out::println);

        Optional<Product> opt = products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                // this does almost the same as findFirst()
                // when you use findAny, the stream will return ANY element that matches your search criteria
                .findAny();


        // if you just want to check if the stream contains an element that match a search criteria
        boolean foundOffice = products.stream()
                //anyMatch does not need a separate filter step, as it takes a Predicate as an argument
                .anyMatch(product -> product.getCategory() == Category.OFFICE);
        System.out.println("Is the element in list? => " + foundOffice);

        //check if all elements of the stream contains specific criteria, by using allMatch
        BigDecimal priceLimit = new BigDecimal("10.00");
        boolean allProductsAreCheap = products.stream()
                //will return true, if all elements from the stream fulfill the Predicate condition
                .allMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
        System.out.println("Are all cheap? => " + allProductsAreCheap);

        //does exact the opposite of allMatch
        boolean allProductsAreExpensive = products.stream()
                .noneMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
        System.out.println("Are all cheap? => " + allProductsAreCheap);


    }

}
