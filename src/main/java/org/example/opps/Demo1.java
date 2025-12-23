package org.example.opps;

import java.util.*;

public class Demo1 {



    public static void main(String[] args) {

       String str1 = "listen";
       String str2 = "sidhfhsufhsuhg";

       if(str1.length()!=str2.length()){
           System.out.println("Not an Anagram");
           return;
       }

       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();


       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();


       Arrays.sort(arr1);
       Arrays.sort(arr2);

       if(Arrays.equals(arr1,arr2)){
           System.out.println("Anagram");
       }

       else {
           System.out.println("Not an Anagram");
       }
    }
}
