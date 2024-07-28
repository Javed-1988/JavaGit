package com.java8;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringNonRepeat {

    public static Map<Integer,Character> nonRepeat(String str)
    {
        Map<Integer,Character> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c))
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

        String str="aaab";

        Set<Character> duplicateElement=new HashSet<>();
//        Set<Character> uniqueElement=new HashSet<>();
//
//        for(int i=0;i<str.length();i++)
//        {
//            for(int j=i+1;j<str.length();j++)
//            {
//                if(str.charAt(i)==str.charAt(j))
//                {
//                    duplicateElement.add(str.charAt(i));
//                }
//                else {
//                    uniqueElement.add(str.charAt(i));
//                }
//            }
//        }
//
//        uniqueElement.forEach(System.out::println);

         // String palindrome or not.............
        char[] c= str.toCharArray();
        String str1="";
        for(int i=c.length-1;i>=0;i--)
        {
            str1=str1+c[i];
        }

        if(str.equals(str1))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

        // find common element in three arrays.............

//        int[] arr= new int[]{1, 4, 8, 7, 5};
//        int[] arr1= new int[]{9,5,4};
//        int[] arr2= new int[]{14,5,12,11,17,16,18,19,4};
//         Set<Integer>  set=new HashSet<>();
//
//        for(int i=0;i<arr1.length;i++)
//        {
//            for(int j=0;j<arr2.length;j++)
//            {
//                if(arr1[i]==arr2[j])
//                {
//                    set.add(arr1[i]);
//                    //break;
//                }
//            }
//            for(int k=0;k<arr.length;k++)
//            {
//                if(arr1[i]==arr2[k])
//                {
//                    set.add(arr1[i]);
//                    //break;
//                }
//            }
//        }
//        set.forEach(System.out::println);
//




//       Map<Integer,Character> map1=nonRepeat("ihyfdggggvgivg");
//        map1.forEach((x,y)->System.out.println(x+" "+" "+y));


// Repeating character and occurrence..............
       //String str="abcabcd";
//        Map<Character, Long> frequencyMap= s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().filter(k->k.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//
//        frequencyMap.forEach((k,v)->System.out.println(k+" "+" "+v));

        //Non Repeat Character with position.............
//        String str="ihyfdggggpvgivg";
//        str.chars().mapToObj(i->(char)i).filter(c->str.indexOf(c)==str.lastIndexOf(c)).forEach(System.out::println);
//
//        //First Non Repeat Character with position....................
//        Optional<Character> non= str.chars().mapToObj(i->(char)i).filter(c->str.indexOf(c)==str.lastIndexOf(c)).findFirst();
//        non.ifPresent(character -> System.out.println("first non repeat character: " + character+" position "+str.indexOf(character)));


       //String character occurrence count......................
//      Map<Character,Integer> map= new HashMap<>();
//      for(int i=0;i<str.length();i++)
//      {
//          char c=str.charAt(i);
//          if(map.containsKey(c))
//          {
//              map.put(c,map.get(c)+1);
//          }
//          else {
//              map.put(c,1);
//          }
//
//
//      }

      //map.forEach((k,v)->System.out.println("character is->"+k+" occurrence->"+v));


        //String Character sort......................
        //char[] chars=str.toCharArray();
//        char temp;
//
//        for(int i=0;i<chars.length;i++)
//        {
//            for(int j=i+1;j<chars.length;j++)
//            {
//                if(chars[i]>chars[j])
//                {
//                    temp=chars[i];
//                    chars[i]=chars[j];
//                    chars[j]=temp;
//                }
//            }
//        }
//        String str1=String.valueOf(chars);
//        System.out.println(str1);

//        Arrays.sort(chars);
//        System.out.println(chars);






    }
}
