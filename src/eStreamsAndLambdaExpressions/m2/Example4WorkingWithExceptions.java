package eStreamsAndLambdaExpressions.m2;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Example4WorkingWithExceptions {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        /*
                Because the exception that the FileWriter constructor is a checked exceptions,
            Java compile require us to deal with the exception. Which we can do it, with a
            try with resource block

                Then we use a for loop to write the products to the file
         */
        try (FileWriter writer = new FileWriter("products.txt")){
            for (Product product: products) {
                writer.write(product.toString() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
                    Replacing the for loop with a forEach() will returns us an ERROR in the lambda expression, because:
                -  the forEach() method takes an INSTANCE of the Functional Interface - Consumer
                - the Consumer interface, defines a method named accept(), that does not have any 'throws' clause
                - since our lambda, is according to the forEach() method an implementation of the accept(),
                it is not allowed to throw any Checked Exceptions
                - to make the code work, we must catch the exception, inisde the lambda
                - but this leads to more boiler plate code, so in some cases, a for loop is a better way than a forEach() lambda
         */

        try (FileWriter writer = new FileWriter("products_forEach.txt")){
            products.forEach(product -> {
                try {
                    writer.write(product.toString() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }

    }
}
