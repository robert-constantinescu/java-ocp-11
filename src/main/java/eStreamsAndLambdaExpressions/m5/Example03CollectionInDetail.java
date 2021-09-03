package eStreamsAndLambdaExpressions.m5;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example03CollectionInDetail {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        // using the reduce method to collect elements in a mutable container is very inefficient
        // reduce is expecting to return IMMUTABLE data, that's why we need to create so many new lists
        products.stream()
                .reduce(new ArrayList<String>(),
                        (list, product) -> {
                            ArrayList<String> newList = new ArrayList<String>(list);
                            newList.add(product.getName());
                            return newList;
                        },
                        (list1, list2) -> {
                            ArrayList<String> newList = new ArrayList<String>(list1);
                            newList.addAll(list2);
                            return newList;
                        }
                );

        // as per below, using the collect method is a lot more efficient
        // there is no need of creating many new intermediary ArrayLists
        // collect expects to work and return mutable objects, reduce expects to return IMMUTABLE objects
        // when you have a MUTABLE container to hold the RESULT, choose collection, otherwise reduce
        products.stream().collect(
                () -> new ArrayList<>(),  //creating a supplier (object where it will collect all elements)
                (list, product) -> list.add(product.getName()),
                (list1, list2) -> list1.addAll(list2)
        );


    }
}
