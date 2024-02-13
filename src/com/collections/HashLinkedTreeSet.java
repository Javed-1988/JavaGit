package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashLinkedTreeSet {

    public static void main(String[]args)
    {
        //HashSet<String> set = new HashSet<>();//does not maintain insertion order have null values and non synchronized
        LinkedHashSet<String> set = new LinkedHashSet<>();//maintain insertion order have null values and non synchronized
        //TreeSet<String> set =new TreeSet<>();//maintain Ascending order to Store element does not have null values non synchronized
        set.add("Mahmood");
        set.add(null);
        set.add("Jak");
        set.add("kaam");
        set.add("Aaved");
        for(String str:set)
        {
            System.out.println(str);
        }
    }
}
