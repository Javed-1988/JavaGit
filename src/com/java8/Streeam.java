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
        List<String> list2=Arrays.asList("apple","samsung","redmi","oneplus","motorola","xiomi");


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


        // Filter out duplicate strings and unique string.................
        //Set<String> uniqueStrings = new HashSet<>();
        //Set<String> duplicateStrings = new HashSet<>();
        //list1.stream().filter(s->!uniqueStrings.add(s)).forEach(e->duplicateStrings.add(e));
        //duplicateStrings.stream().forEach(a->System.out.println(a));
        //uniqueStrings.stream().forEach(System.out::println);


        //sort element based on length of the emp name....................
        //emp.stream().sorted(Comparator.comparingInt(e->e.getName().length())).forEach(s->System.out.println(s));

        //Name of the emp which salary is more than 20000.....................
        //emp.stream().filter(e->e.getSalary()>20000).map(s->s.getName()).forEach(r->System.out.println(r));

        //Emp name and Highest salary group by department................
//        Map<String, Optional<designpattern.Employee>> map=emp.stream().collect(Collectors.groupingBy(designpattern.Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(designpattern.Employee::getSalary))));//.forEach((k,v)->System.out.println(k+v));
//        map.forEach((key,value)->{
//           System.out.println("Department: "+key);
//           value.stream().map(s->s.getName()+" "+s.getSalary()).forEach(System.out::println);
//       });

        //Emp name and Lowest salary group by department................
//        Map<String, Optional<designpattern.Employee>> map=emp.stream().collect(Collectors.groupingBy(designpattern.Employee::getDepartment,Collectors.minBy(Comparator.comparingDouble(designpattern.Employee::getSalary))));//.forEach((k,v)->System.out.println(k+v));
//        map.forEach((key,value)->{
//           System.out.println("Department: "+key);
//           value.stream().map(s->s.getName()+" "+s.getSalary()).forEach(System.out::println);
//       });

        // Average salary of Emp of each Department..............
        //emp.stream().collect(Collectors.groupingBy(designpattern.Employee::getDepartment,Collectors.averagingDouble(designpattern.Employee::getSalary))).forEach((k,v)->System.out.println(k+" "+v));


        //getting Key and value form List and put into Map................
//        HashMap<String,String> map2 =new HashMap();
//        list1.stream().forEach(s->map2.put(s,s));
//        map2.forEach((k,v)->System.out.println(k+v));


        //Distinct department name based on Reverse Order.................
       //emp.stream().sorted(Comparator.comparing(designpattern.Employee::getDepartment,Comparator.reverseOrder())).map(s->s.getDepartment()).distinct().forEach(s->System.out.println(s));

        //Total salary of Each Department....................
       // emp.stream().collect((Collectors.groupingBy(designpattern.Employee::getDepartment,Collectors.summingDouble(designpattern.Employee::getSalary)))).forEach((k,v)->System.out.println(k+" "+v));

        //Minimum Salary of Emp............
//        Double min= emp.stream().min(Comparator.comparingDouble(designpattern.Employee::getSalary)).orElseThrow().getSalary();
//        System.out.println(min);

        //Maximum Salary of Emp............
//        Double sal= emp.stream().max(Comparator.comparingDouble(designpattern.Employee::getSalary)).orElseThrow().getSalary();
//        System.out.println(sal);


        //Find Odd Number in list................
       //list.stream().filter(s->s%2!=0).forEach(System.out::println);

        // Find Max In a List.............
//        Integer max=list.stream().max(Comparator.comparingInt(Integer::intValue)).orElseThrow();
//        System.out.println(max);


       //Print List in Descending Oder................
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Print List Based on String length................
        //list1.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(s->System.out.println(s));

        //Flatmap..................
//        List<List<String>> flatmap=new ArrayList<>();
//        flatmap.add(list1);
//        flatmap.add(list2);
//        flatmap.stream().flatMap(List::parallelStream).sorted(Collections.reverseOrder()).forEach(System.out::println);



        //Sort Emp Based on Name and salary.................
        //emp.stream().sorted(Comparator.comparing(designpattern.Employee::getName).thenComparing(designpattern.Employee::getSalary)).forEach(System.out::println);

        //Singleton.getSingelton();
        //Singleton.getSingelton();



    }
}
