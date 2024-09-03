package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamPractice {
    public static void main(String[]args) {
        List<Integer> integerList = Arrays.asList(10, 50, 4, 60, 15, 8, 50);
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "guava", "apple", "jackfruit");
        Set<Integer> set = new HashSet<>();
        //Count
//        long count=integerList.stream().count();
//        System.out.println(count);

        //Sorting Ascending order
        //integerList.stream().sorted().forEach(System.out::println);

        //Sorting Descending order
        //integerList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);

        //Sum using reduce function
        //Optional<Integer> count=integerList.stream().reduce((x, y)->x+y);

        //Sum using convert map to int function
        //long sum=integerList.stream().mapToInt(Integer::intValue).limit(2).sum();
        //System.out.println(sum);

        //Average function
        //OptionalDouble average=integerList.stream().mapToInt(Integer::intValue).average();

        //Max function
//        OptionalInt max=integerList.stream().mapToInt(Integer::intValue).max();
//        System.out.println(max.getAsInt());

        //Min function
//        OptionalInt min=integerList.stream().mapToInt(Integer::intValue).min();
//        Optional<Integer> min1=integerList.stream().min(Comparator.comparingInt(Integer::intValue));
//        System.out.println(min.getAsInt());
//        System.out.println(min1.get());

        //Finding duplicate
        //integerList.stream().filter(s->!set.add(s)).forEach(System.out::println);
//        long count=integerList.stream().filter(s->!set.add(s)).count();
//        System.out.println(count);

        //String sorting Ascending order
        //stringList.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        //String sorting Descending order........................
        stringList.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
    }
}
