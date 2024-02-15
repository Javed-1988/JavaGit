package com.java8;

import designpattern.Employee;
import designpattern.Singleton;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Streeam {

    public static void main(String[]args)
    {

        List<Integer> list = Arrays.asList(10,20,40,55,6,30);

        List<String> list1=Arrays.asList("jak","apple","mahmood","zahedi","apple","zahedi");
        List<String> list2=Arrays.asList("anika","javed","mamoon","siza","maa","bapu");

//        String str = "hello";
//
//        Optional<Character> result = str.chars() // IntStream of character codes
//                .mapToObj(i -> (char) i) // Convert character codes to characters
//                .filter(c -> str.indexOf(c) == str.lastIndexOf(c)) // Filter non-repeating characters
//                .findFirst(); // Find the first non-repeating character
//
//        result.ifPresentOrElse(
//                c -> System.out.println("First non-repeating character: " + c), // Print the non-repeating character
//                () -> System.out.println("No non-repeating character found") // Print if no non-repeating character found
//        );
//
//
        List<Employee> emp=Arrays.asList(new Employee(1,"javed",5000,"IT"),
               new Employee(2,"mahmood",25000,"IT"),
               new Employee(3,"jaga",10000,"HR"),
               new Employee(4,"balo",50000,"HR"),
               new Employee(5,"soumen",50000,"marketing"),
               new Employee(6,"sougata",70000,"Railway"),
               new Employee(7,"deepak",45000,"Railway"));

        Set<String> uniqueStrings = new HashSet<>();
        // Create a set to store duplicate strings
        Set<String> duplicateStrings = new HashSet<>();

        // Filter out duplicate strings

        list1.stream().filter(s->!uniqueStrings.add(s)).forEach(e->duplicateStrings.add(e));

       // List<String> list2=duplicateStrings.stream().collect(Collectors.toList());
        //list2.forEach(a->System.out.println(a));

        //emp.stream().sorted(Comparator.comparingInt(e->e.getName().length())).forEach(s->System.out.println(s));
        //emp.stream().filter(e->e.getSalary()>20000).map(s->s.getName()).forEach(r->System.out.println(r));
       // HashMap<String,String> map2=new HashMap<>();

        //Map<String, Optional<designpattern.Employee>> map=emp.stream().collect(Collectors.groupingBy(designpattern.Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(designpattern.Employee::getSalary))));//.forEach((k,v)->System.out.println(k+v));
       //map.forEach((key,value)->{
           //System.out.println("Department: "+key);
           //value.stream().map(s->s.getName()+s.getSalary()).forEach(s->System.out.println(s));
       //});
      // list1.stream().forEach(s->map2.put(s,s));
       //map2.forEach((k,v)->System.out.println(k+v));
       //emp.stream().sorted(Comparator.comparing(designpattern.Employee::getDepartment,Comparator.reverseOrder())).map(s->s.getDepartment()).distinct().forEach(s->System.out.println(s));
       //emp.stream().collect((Collectors.groupingBy(designpattern.Employee::getDepartment,Collectors.summingDouble(designpattern.Employee::getSalary)))).forEach((k,v)->System.out.println(k+v));


        //Double min= emp.stream().min(Comparator.comparingDouble(designpattern.Employee::getSalary)).orElseThrow().getSalary();
      // System.out.println(min);
       //emp.stream().collect(Collectors.groupingBy(designpattern.Employee::getDepartment,Collectors.averagingDouble(designpattern.Employee::getSalary))).forEach((k,v)->System.out.println(k+v));
       // list.stream().filter(s->s%2!=0).forEach(s->System.out.println(s));
       // Integer max=list.stream().max(Comparator.comparingInt(Integer::intValue)).orElseThrow();
        //System.out.println(max);
        //list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
        //list1.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(s->System.out.println(s));

//        List<List<String>> flatmap=new ArrayList<>();
//        flatmap.add(list1);
//        flatmap.add(list2);
//        flatmap.stream().flatMap(List::parallelStream).sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));
//        Double sal= emp.stream().max(Comparator.comparingDouble(designpattern.Employee::getSalary)).orElseThrow().getSalary();
//        System.out.println(sal);
        //emp.stream().sorted(Comparator.comparing(designpattern.Employee::getName).thenComparing(designpattern.Employee::getSalary)).forEach(s->System.out.println(s));

        Singleton.getSingelton();
        Singleton.getSingelton();



    }
}
