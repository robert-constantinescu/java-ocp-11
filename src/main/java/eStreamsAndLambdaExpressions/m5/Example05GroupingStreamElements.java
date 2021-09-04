package eStreamsAndLambdaExpressions.m5;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example05GroupingStreamElements {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        Map<Category, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));


        Map<Category, List<String>> productsNamesByCategory = products.stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.mapping(Product::getName, Collectors.toList())
                        ));


        // Challenge! Can you explain exactly how this works?
        //TODO Can you explain exactly how this works?
        Map<Category, BigDecimal> totalPerCategory = products.stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.mapping(
                                        Product::getPrice,
                                        Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))
                        ));

        System.out.println(totalPerCategory);

    }
}
