package eStreamsAndLambdaExpressions.m2;

import eStreamsAndLambdaExpressions.setup.Category;
import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.List;

public class Example5MethodReferences {

    interface ProductFactory {
        Product create(Category category, String name, BigDecimal price);
    }

    static boolean isExpensive(Product product) {
        return product.getPrice().compareTo(new BigDecimal("5.00")) >= 0;
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();


        // Suppose that we want to print each product from the list
        // When we are calling the forEach() method, we are giving it a method that it should be executed on each element from the list
        // the method we are giving it here, is an anonymous method in the form of a lambda expression
        // but the lambda, is really an extra unnecessary layer, because the only thing it does is to call another method
        products.forEach(product -> System.out.println(product));


        // we can replace the lambda, by a method reference to the println() method of the System.out object
        products.forEach(System.out::println);

        // a method reference is a kind of pointer ot a method, that just like a lambda, implements a functional interface
        // the method, that the method reference points to, MUST match with a method defined by the Functional Interface
        // the Functional Interface, that forEach() take, is the Consumer interface, which implements an accept() method
                // the accept() method, takes 1 parameter and returns void
        // the println() method is defined in the class PrintStream,
                //println also takes 1 parameter, and returns void, just like the accept() from the Consumer Interface


        // the static method isExpensive(), matches Predicate interface(it's test() method, which takes 1 param and returns boolean )
        products.removeIf(Example5MethodReferences::isExpensive);


        // here the Product::getName, refers to the instance method getName() of class Product,
        //          but not to any particular Product from products lis
        // the map() method is going to call getName(), on each product in the stream
        products.stream().map(Product::getName).forEach(System.out::println);


        // basically here we tell that the implementation of the create() method, should be the Product::new
        // note that create() and the constructor of the Product class, have the same signature
        //          - same number of params, same params type, same return type
        /*
                    IF METHOD SIGNATURE DON'T MATCH, IT WILL THROW A COMPILE ERROR

             This type of implementation, can be used with the FACTORY Design Pattern
         */
        ProductFactory factory = Product::new;

        // here we are basically calling the implementation of the create() method,
        // which we defined as being the constructor of the Product
        Product blueberries = factory.create(Category.FOOD, "blueberries", new BigDecimal("6.95"));

    }
}
