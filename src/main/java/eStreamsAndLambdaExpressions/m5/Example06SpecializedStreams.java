package eStreamsAndLambdaExpressions.m5;

import eStreamsAndLambdaExpressions.setup.ExampleData;
import eStreamsAndLambdaExpressions.setup.Product;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Example06SpecializedStreams {

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        // just a note. Double is a not great way to work with value of money, because it does not have great precision
        DoubleStream prices = products.stream()
                // this returns a double stream, which contains values of the primitive type double
                .mapToDouble(product -> product.getPrice().doubleValue());

        // calculate sum of all the prices
        double total = prices.sum();

        DoubleSummaryStatistics doubleSummaryStatistics = products.stream()
                // this returns a DoubleSummaryStatistics object that has interesting statistical methods
                .mapToDouble(product -> product.getPrice().doubleValue())
                .summaryStatistics();

        double sum = doubleSummaryStatistics.getSum();
        double average = doubleSummaryStatistics.getAverage();
        long count = doubleSummaryStatistics.getCount();
        double max = doubleSummaryStatistics.getMax();
        double min = doubleSummaryStatistics.getMin();

    }
}
