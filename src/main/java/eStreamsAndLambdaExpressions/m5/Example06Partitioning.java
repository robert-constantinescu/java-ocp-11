package eStreamsAndLambdaExpressions.m5;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example06Partitioning {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");
        // partitioning is just a special case of grouping
        // where we use a Predicate as the classifier function to split the results in 2 groups
        //          - just like the groupingBy Collector, the partitioningBy splits the
        //      input stream into 2 separate streams which will have to be collected
        //          - if another Downstream collector is not specified,
        //     than the toList() collector will be used which collects the 2 groups into lists
        //          - to collect the output streams in a different way, you can specify a downstream collector
        //     in exactly the same way as with the groupingBy collector
        //          - Collectors can also by combined in the same way, to perform more sophisticated operations

        Map<Boolean, List<Product>> partitionedProducts = products.stream()
                .collect(
                        // the partitioningBy takes a Predicate which determines in which of 2 groups each element belongs
                        // to partition the products into cheap and expensive Products
                        //          - we'll implement the Predicate to check if the price of the product is less than 5.00$
                        //the results of the partitioningBy will be a Map<Boolean, List<Product>>
                        //          - the map will have exactly 2 entries, one for Boolean true, and one for false
                        Collectors.partitioningBy(product -> product.getPrice().compareTo(priceLimit) < 0)
                );

        System.out.println("Cheap Products: ");
        partitionedProducts.get(true).forEach(System.out::println);

        System.out.println("Expensive Products: ");
        partitionedProducts.get(false).forEach(System.out::println);



    }
}
