package org.example.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FaleFasteExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                itr.remove();
            }
        }

        System.out.println(arrayList);

        itr = arrayList.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 3) {
                itr.remove();
            }
        }

        System.out.println(arrayList);

        //falefat itrater

        Map<String,String> cityCode=new HashMap<>();
        cityCode.put("Delhi","India");
        cityCode.put("Pakistan","Lahore");
        cityCode.put("US","Amireka");

        Iterator iterator= cityCode.keySet().iterator();

        while (iterator.hasNext()){
            System.out.println(cityCode.get(iterator.next()));
            cityCode.put("UP","Locknow");
        }
    }

    }

