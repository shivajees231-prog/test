package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondSmallest {


    public static void main(String[] args) {

        String[]  s1={"aa","bbb","1eeeew","ggggg"};

        Arrays.stream(s1).filter(e->e.length()>=3).forEach(System.out::println);
        Arrays.stream(s1).filter(e->e.length()>=10 ).forEach(System.out::println);
        Arrays.stream(s1).filter(e->e.startsWith("1")).forEach(System.out::println);

        List<String> name=Arrays.asList("Amit","sumitsingh","Tataji","Balaji","Ramji");
        List<String> endWith=name.stream().filter(e->e.endsWith("ji")).collect(Collectors.toList());

        System.out.println(endWith);


        String s8="Balaji";

        String s9="";
        for(int i=1;i<s8.length();i++){
            s9=s8.charAt(i)+s9;
        }


System.out.println(s9);


        List<String> s3=Arrays.asList("a","b","c","d");
        List<String> s4=Arrays.asList("b","c","d","e");
        List<String> s5=Arrays.asList("c","d","e","f");

       Set<String> intersection= s3.stream().filter(s3::contains)
               .filter(s4::contains)
               .filter(s5::contains)
               .collect(Collectors.toSet());

       System.out.println(intersection);

        String[] arr = {"apple", "", "banana", " ", "cherry", ""};



       String[] clread= Arrays.stream(arr).filter(e->e!=null && !e.trim().isEmpty()).toArray(String[]::new);
System.out.println(Arrays.toString(clread));

      /*  // Using Arrays.stream
        String[] cleaned = Arrays.stream(arr)
                .filter(s -> s != null && !s.trim().isEmpty())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(cleaned));*/


    }
}
