package org.example.stream;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface  Add{
    int addition(int a,int b);
}
public class LemdaTest {
    public static void main(String[] args) {

        Add add = (a, b) -> a + b;

        int result = add.addition(10, 20);

        System.out.println("sum:" + result);

        String[] name = {"a", "b", "c", "d", "e"};
        String result1 = IntStream.range(0, name.length).mapToObj(i -> name[i] + "=" + (i + 1)).collect(Collectors.joining(","));
        System.out.println(result1);

        //output = a=1,b=2,c=3,d=4,e=5 using java 8 stream api



    }
}
