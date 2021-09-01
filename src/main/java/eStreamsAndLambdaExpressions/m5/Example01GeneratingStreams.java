package eStreamsAndLambdaExpressions.m5;

import java.math.BigInteger;
import java.util.UUID;
import java.util.stream.Stream;

public class Example01GeneratingStreams {

    public static void main(String[] args) {

        // the generate() factory method
        // generates an infinite stream of values produced by a supplier
        Stream<UUID> randomUuids = Stream.generate(UUID::randomUUID); // this is an infinite stream
        randomUuids.limit(10).forEach(System.out::println);


        // there are 2 versions of the iterate() method
        //   - the one that takes a Seed and an UnaryOperator, generate an infinite stream(like generate())
        // n -> n.multiply(BigInteger.TWO), will take the previous element, and multiplies by 2
                // the stream starts from 1
        Stream<BigInteger> powerOfTwo = Stream.iterate(BigInteger.ONE, n -> n.multiply(BigInteger.TWO));
        powerOfTwo.limit(24).forEach(System.out::println);

        // the second versions of iterate
        // takes a predicate to determines if there is a next element to be generated
        // below we generate all letters from A to Z
        Stream<Character> alphabet = Stream.iterate('A', letter -> letter <= 'Z', letter -> (char)(letter + 1));
        alphabet.forEach(System.out::println);


        // the stream is mutable, until the build() method is called on the builder
        Stream.Builder<String> builder = Stream.builder();
        builder.add("one");
        builder.add("two");
        builder.add("three");
        Stream<String> streamBuild = builder.build();
        streamBuild.forEach(System.out::println);




    }
}
