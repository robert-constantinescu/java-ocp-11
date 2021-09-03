package eStreamsAndLambdaExpressions.m5;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example04CollectorsMethods {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        Map<Category, BigDecimal> totalPerCategory = products.stream()
                .collect(Collectors.toMap(
                        product -> product.getCategory(),           //key mapper function
                        product -> product.getPrice(),              // value mapper function
                        (value1, value2) -> value1.add(value2)      // what to do with values that has the same key
                ));

        System.out.println(totalPerCategory);

    }
}
