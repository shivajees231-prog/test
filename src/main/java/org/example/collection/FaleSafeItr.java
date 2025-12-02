package org.example.collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FaleSafeItr {
    public static void main(String[] args) {


        ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
        chm.put("ONE", 1);
        chm.put("TWO", 2);
        chm.put("THREE", 3);
        chm.put("FOUR", 4);

        Iterator it = chm.keySet().iterator();
        while (it.hasNext()) {

            String key = (String) it.next();

            System.out.println(key + ":" + chm.get(key));

            chm.put("SEVEN",7);
        }
    }

}