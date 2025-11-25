package org.example.test1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        int[] arr ={34,27,82,45,19,40};

        List<Integer> list = Arrays.stream(arr).boxed().toList();

        // First stream for 40 and 82
        Stream<Integer> first = list.stream()
                .filter(n -> n == 40 || n == 82);

        // Second stream for remaining numbers
        Stream<Integer> rest = list.stream()
                .filter(n -> n != 40 && n != 82);

        // Concatenate both streams and print
        Stream.concat(first, rest)
                .forEach(System.out::println);

    }

}
