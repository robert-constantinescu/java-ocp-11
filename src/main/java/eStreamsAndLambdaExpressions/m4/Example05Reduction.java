package eStreamsAndLambdaExpressions.m4;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Example05Reduction {


    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();
//        Predicate<Product> onlyFood =


        //This is not a best practice do collect the elements of a stream
        // this violates the functional programming principle of not having side effects in functions
        // because the functions that we pass here, in the form of a method reference
                //has the side effect of modifying the foodProductNames, and
                // it won't work correctly if the used stream is a parallel stream
        List<String> foodProductNames = new ArrayList<>();
        products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .map(Product::getName)
                .forEach(foodProductNames::add);


        // a better way is to use collect, instead of each
        // note that in this improved version, we don't need to have any function with side effects
        // we leave building the collection to the Collector, which can do it in a safe way
                // even when using parallel streams
        List<String> foodProductNamesV2 = products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .map(Product::getName)
                .collect(Collectors.toList());


        String categories = products.stream()
                // first we get all the product categories
                .map(Product::getCategory)
                // next we remove the duplicates
                .distinct()
                // next we transform the Category.ENUM constants to String
                .map(Category::name)
                // and finally we use the collector to join all the Stream elements into a String rather than a collection
                .collect(Collectors.joining("; "));





    }

}
