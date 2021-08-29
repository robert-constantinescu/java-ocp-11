package eStreamsAndLambdaExpressions.m2;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Example3CapturingVariables {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        /*
                This is a bad practice.

                Although the code below compiles and executes,

                YOU SHOULD AVOID Side-effects in lambda expression, such as:
                    - modifying state of OBJECTS that come from OUTSIDE of the lambda

         */
        List<Product> cheapProducts = new ArrayList<>();
        products.forEach(product -> {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                /*
                          This works, because we are not modifying the variables cheapProducts,
                        but we are modifying the object that it refers to

                        When a variable is FINAL or EFFECTIVELY FINAL, it only means that we can't:
                            - modify the variable itself
                            - reassign the variable itself

                            In the case of a MUTABLE object(like an ArrayList) in this case,
                       we can still modify the STATE of the object
                 */
                cheapProducts.add(product);
            }
        });

        System.out.println(cheapProducts.size() + " cheap products");


    }
}
