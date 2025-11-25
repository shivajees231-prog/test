package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {


        List<Integer> duplicate= Arrays.asList(10,20,5,8,98,15,98,10);


        //System.out.println(duplicate);

        Set<Integer> set=new HashSet<>();

        duplicate.stream().filter(e->!set.add(e)).forEach(System.out::println);





        }
    }
