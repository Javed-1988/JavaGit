package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prac {

    public static <Charcter> void main(String[] args) {


        List<Integer> list = Arrays.asList(10, 20, 40, 55, 6, 30, 140, 5,65,6);

        List<String> list1 = Arrays.asList("jak", "apple", "mahmood", "zahedi", "apple", "zahedi");
        List<String> list2 = Arrays.asList("apple", "samsung", "redmi", "oneplus", "motorola", "xiomi");

        List<Employee> emp = Arrays.asList(new Employee(1, "javed", 5000, "IT", 35),
                new Employee(2, "mahmood", 25000, "IT", 36),
                new Employee(3, "jaga", 10000, "HR", 39),
                new Employee(4, "balo", 50000, "HR", 34),
                new Employee(5, "soumen", 52000, "marketing", 40),
                new Employee(6, "sougata", 70000, "Railway", 42),
                new Employee(7, "deepak", 45000, "Railway", 36),
                new Employee(8, "sumanta", 35000, "Railway", 38));


       int []num={0,1,0,0,1,1,0,1,1,0};
       int target=0;
       int replace=0;
       int temp=0;

        for(int i=0;i<num.length;i++)
       {
           for(int j=i+1;j<num.length;j++)
           {
               if(num[i]<num[j])
               {
                   temp=num[i];
                   num[i]=num[j];
                   num[j]=temp;
               }
           }


       }
        for(int k:num)
        {
            System.out.println(k);
        }





    }
}











