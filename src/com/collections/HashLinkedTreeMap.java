package com.collections;

import java.util.*;

public class HashLinkedTreeMap {

    public static void main(String[]args)
    {
        HashMap<Integer,String> map= new HashMap<>(6);//Hashmap can have one null key Multiple null values
        // its store element based on hashcode it is non synchronized Hashmap default size 16 load factor 0.75 after exceeding its size it will rehash

        //Hashtable<Integer,String> map= new Hashtable<>(); // HashTable is synchronized can not have null key or values

        //LinkedHashMap<Integer,String> map= new LinkedHashMap<>();////LinkedHashMap can have one null key Multiple null values
        // its maintain insertion order it is non synchronized LinkedHashMap default size 16 load factor 0.75 after exceeding its size it will rehash

        //TreeMap<Integer,String> map= new TreeMap<>();//TreeMap can not have null key or null values its strong element in ascending order

        //Collections.synchronizedMap(map);//for synchronized hashmap

        map.put(5,"javed");
        map.put(1,"Jav");
        map.put(2,"Jak");
        map.put(7,"Jak");
        map.put(3,"Jamm");
        map.put(4,"Jamm");
        System.out.println("Hashmap size"+map.size());
        map.put(9,"Mah");


        //System.out.println(map.get(null));

        for(Map.Entry m: map.entrySet())
        {
            //map.put(4,"Javed");
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer, String> hashMap = new HashMap<>();


        // Populate the HashMap with 1000000 entries
        for (int i = 0; i < 1000000; i++) {
            hashMap.put(i, "Value" + i);
        }

        // Access some entries and measure the time taken
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            String value = hashMap.get(i); // Accessing elements
        }

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        double milliseconds = duration / 1e6;

        System.out.println("Time taken to access 1000 elements: " + milliseconds + " milliseconds");
    }
}
