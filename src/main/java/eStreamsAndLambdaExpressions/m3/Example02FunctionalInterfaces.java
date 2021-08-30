package eStreamsAndLambdaExpressions.m3;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import javax.sound.sampled.Port;
import java.util.*;
import java.util.function.Predicate;

public class Example02FunctionalInterfaces {


    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        Map<Category, List<Product>> productsByCategory = new HashMap<>();


        //classic way
        for (Product product : products) {
            Category category = product.getCategory();

            if (!productsByCategory.containsKey(category)) {
                productsByCategory.put(category, new ArrayList<>());
            }

            productsByCategory.get(category).add(product);
        }

        //using functional interfaces
        for (Product product : products) {
            Category category = product.getCategory();
            productsByCategory.computeIfAbsent(category, newList -> new ArrayList<>()).add(product);
        }

        productsByCategory.forEach((category, prodList) -> {
            System.out.println("Category: " + category);
            prodList.forEach(prod -> {
                System.out.println("- " + prod.getName());
            });
        });


    }
}
