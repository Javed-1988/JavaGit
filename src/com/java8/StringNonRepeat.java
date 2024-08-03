package com.java8;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringNonRepeat {

//    public static Map<Integer,Character> nonRepeat(String str)
//    {
//        Map<Integer,Character> map=new HashMap<>();
//        for(int i=0;i<str.length();i++)
//        {
//            char c=str.charAt(i);
//            if(str.indexOf(c)==str.lastIndexOf(c))
//            {
//                map.put(i,c);
//                //if want first non repeat character
//                //break;
//
//            }
//            else {
//                //find duplicate element
//                //map.put(i,c);
//            }
//        }
//        return map;
//    }

    public static void main(String[]args)
    {

        String str="malylam";

//        HashMap<Character,Integer> map =new HashMap<>();
//
//        char [] c=str.toCharArray();
//
//        for (int i=0;i<c.length;i++)
//        {
//            if(map.containsKey(c[i]))
//            {
//                map.put(c[i],map.get(c[i])+1);
//            }
//            else {
//                map.put(c[i],1);
//            }
//        }
//
//        map.forEach(((k,v)->System.out.println("character-"+k+" occurrence--"+v)));

//        String str="orange:1;apple:2;orange:5;pears:10;apple:5";
//        String[] entries=str.split(";");
//        HashMap<String,Integer> map=new HashMap<>();
//
//        for(int i=0;i<entries.length;i++) {
//            String[] parts = entries[i].split(":");
//            String fruit = parts[0];
//            int qty = Integer.parseInt(parts[1]);
//            //System.out.println(fruit);
//
//            if (map.containsKey(fruit)) {
//
//                map.put(fruit, map.get(fruit) + qty);
//            } else {
//
//                map.put(fruit, qty);
//            }
//        }
//
//        map.forEach((k,v)->System.out.println(k+"-"+v));



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
//        char[] c= str.toCharArray();
//        String str1="";
//        for(int i=c.length-1;i>=0;i--)
//        {
//            str1=str1+c[i];
//        }
//
//        if(str.equals(str1))
//        {
//            System.out.println("palindrome");
//        }
//        else {
//            System.out.println("not palindrome");
//        }

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
//       String str2="abcabcd";
//        Map<Character, Long> frequencyMap= str2.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
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

//        String str="123;45;98";
//
//        String [] str1= str.split(";");
//        int temp=0;
//
//        for(int i=0;i<str1.length;i++)
//        {
//            // System.out.println(str1[i]);
//            char [] c=str1[i].toCharArray();
//            for(int j=0;j<c.length;j++)
//            {
//                temp=temp+Integer.parseInt(String.valueOf(c[j]));
//            }
//        }
//        System.out.println(temp);

        //25. int [] num=[1,3,4,1,3,5]                        output---[1,3,4,5] only unique showing

//        int [] num={1,3,4,1,3,5};
//        List<Integer> list=new ArrayList<>();
//        //System.out.println(num1.length);
//        HashSet<Integer> set=new HashSet<>();
//
//        for(int i=0;i<num.length;i++)
//        {
//            //System.out.println(list.size());
//            if(list.isEmpty())
//            {
//                list.add(num[i]);
//            }
//            if(list.contains(num[i]))
//            {
//
//            }
//            else {
//                list.add(num[i]);
//            }
//
//
//
//        }
//
//        list.forEach(System.out::println);

        //nums=[2,3,10,7,6]                                output--- check 2*3=6 next element is 6 or not 3*10=30 next element 30 0r not


//        int[] nums = {2, 3, 10, 30, 6,7,42,9};
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int temp = 0;
//            int j = i + 1;
//            int k = i + 2;
//
//            if (j < nums.length) {
//                temp = nums[i] * nums[j];
//            }
//            if (k < nums.length) {
//                if (temp == nums[k]) {
//                    System.out.println("true");
//                } else {
//                    System.out.println("false");
//                }
//
//            }
//        }

//        int [] nums={2,4,7,64,32,9,16}; // finding the power of 2 each array element
//
//        int num=2;
//
//
//        for(int i=0;i<nums.length;i++)
//        {
//            int number=nums[i];
//            if(number%2==0)
//            {
//                int power=0;
//                while(number>=1) {
//                    number = number / 2;
//                    if(number>=1)
//                    {
//                        power++;
//                    }
//
//                }
//                System.out.println("power is="+power);
//            }
//            else {
//                System.out.println(nums[i]+" is not power of 2");
//            }
//
//        }






    }
}
