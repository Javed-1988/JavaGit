package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class StringNonRepeat {

    public static Map<Integer,Character> nonRepeat(String str)
    {
        Map<Integer,Character> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
            {
                map.put(i,c);
                //if want first non repeat character
                //break;

            }
            else {
                //find duplicate element
                //map.put(i,c);
            }
        }
        return map;
    }

    public static void main(String[]args)
    {
//        Map<Integer,Character> map1=nonRepeat("ihyfdggggvgivg");
//        map1.forEach((x,y)->System.out.println(x+" "+" "+y));


// Repeating character and occurrence
//        String s="ihyfdggggvgivg";
//        Map<Character, Long> frequencyMap= s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().filter(k->k.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//
//        frequencyMap.forEach((k,v)->System.out.println(k+" "+" "+v));

        //Non Repeat Character
        String str="ihymfvdggmggvgivg";
        str.chars().mapToObj(i->(char)i).filter(c->str.indexOf(c)==str.lastIndexOf(c)).forEach(System.out::println);

        //First Non Repeat Character
//        Optional<Character> non= str.chars().mapToObj(i->(char)i).filter(c->str.indexOf(c)==str.lastIndexOf(c)).findFirst();
//        non.ifPresent(character -> System.out.println("first non repeat character: " + character));

        //Non Repeat Character with positions
        IntStream.range(0, str.length()).filter(i -> str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
                .forEach(k->System.out.println("Character: "+str.charAt(k)+" Position: "+k));

        //First Non Repeat Character with positions
        IntStream.range(0, str.length()).filter(i -> str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))).limit(1)
                .forEach(k->System.out.println("First Non Repeat Character: "+str.charAt(k)+" Position: "+k));



    }

}
