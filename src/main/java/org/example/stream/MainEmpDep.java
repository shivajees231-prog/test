package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class MainEmpDep {

    public static void main(String[] args) {

        ArrayList<Project> projects =  new ArrayList<>();
        projects.add(new Project("1","one","two","three"));
        Employee e1=new Employee(101,"Amit","Development",projects, 10.0,"male");


System.out.println(projects);
















// interview Qustions
        List<String> list=Arrays.asList("AA","BB","CC","AA" );

        Map<String,Long> duplicate=list.stream().collect(groupingBy(e->e,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(duplicate);

       String input="abc de";
       String[] word=input.split(" ");
       StringBuilder stringBuilder=new StringBuilder();
       for (String words:word){
           stringBuilder.append(new StringBuilder(words).reverse()).append(" ");
           System.out.println(stringBuilder.toString().trim());
       }





    }


}
