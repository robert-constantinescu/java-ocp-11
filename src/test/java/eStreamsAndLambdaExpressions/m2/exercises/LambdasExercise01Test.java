package eStreamsAndLambdaExpressions.m2.exercises;

import eStreamsAndLambdaExpressions.m2.exercises.LambdasExercise01;
import eStreamsAndLambdaExpressions.setup.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static eStreamsAndLambdaExpressions.setup.Category.*;
import static org.assertj.core.api.Assertions.assertThat;

class LambdasExercise01Test {

    private static final List<Product> TEST_PRODUCTS = Arrays.asList(
            new Product(OFFICE, "Pencils", new BigDecimal("5.79")),
            new Product(FOOD, "Apples", new BigDecimal("1.29")),
            new Product(UTENSILS, "Plates", new BigDecimal("12.95")),
            new Product(FOOD, "Spaghetti", new BigDecimal("2.79")),
            new Product(FOOD, "Coffee", new BigDecimal("7.49")),
            new Product(CLEANING, "Detergent", new BigDecimal("3.79")));

    private LambdasExercise01 exercise = new LambdasExercise01();

    @Test
    @DisplayName("Exercise 1: Sort products by name")
    void sortProductsByName() throws NoSuchFieldException, IllegalAccessException {
        List<Product> products = new ArrayList<>(TEST_PRODUCTS);

        exercise.sortProductsByName(products);

        assertThat(products)
                .describedAs("Exercise 1: Your solution does not return the correct result.")
                .containsExactly(
                        new Product(FOOD, "Apples", new BigDecimal("1.29")),
                        new Product(FOOD, "Coffee", new BigDecimal("7.49")),
                        new Product(CLEANING, "Detergent", new BigDecimal("3.79")),
                        new Product(OFFICE, "Pencils", new BigDecimal("5.79")),
                        new Product(UTENSILS, "Plates", new BigDecimal("12.95")),
                        new Product(FOOD, "Spaghetti", new BigDecimal("2.79")));
    }
}
