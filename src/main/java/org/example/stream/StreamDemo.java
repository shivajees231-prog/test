package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {


        String[] arr={"java","Php","Oracele","spring","microservice"};
        Stream<String> input= Arrays.stream(arr);
        Stream<String> stringStream=Stream.of(arr);

        stringStream.forEach(e->System.out.println(e));
        input.forEach(e->System.out.println(e));

        int[] num={1,2,3,4,5};
        IntStream stm=Arrays.stream(num);

        stm.forEach(e->System.out.println(e));

        Stream<Integer> stream=Stream.of(-2,5,7,3,9);

        Set<Integer> set=stream.collect(Collectors.toSet());
        System.out.println(set);

        Set<Integer> set1=new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(12);
        set1.add(8);
        set1.add(10);
        set1.add(6);
        Stream<Integer> converstream=set1.stream();
        converstream.forEach(e->System.out.println(e+""));

       List<Integer> sorteds= set1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
      System.out.println(sorteds);


      String[] strings=new String[10];
      String s=strings[5].toLowerCase();
      System.out.println(s);

    }
}
