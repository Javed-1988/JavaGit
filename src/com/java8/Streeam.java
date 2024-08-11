package com.java8;

import com.java8.Employee;

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

        List<Employee> emp = Arrays.asList(new Employee(1, "javed", 5000, "IT", 35,"M"),
                new Employee(2, "mahmood", 25000, "IT", 46,"M"),
                new Employee(3, "jaga", 10000, "HR", 39,"M"),
                new Employee(4, "balo", 50000, "HR", 34,"M"),
                new Employee(5, "soumen", 52000, "marketing", 40,"M"),
                new Employee(6, "sougata", 70000, "Railway", 42,"M"),
                new Employee(7, "deepak", 45000, "Railway", 36,"M"),
                new Employee(8, "sumanta", 35000, "Railway", 38,"M"),
                new Employee(9, "Nusrat", 45000, "IT", 32,"F"),
                new Employee(10, "Srabonti", 25000, "Railway", 30,"F"),
                new Employee(11, "Sayantika", 41000, "marketing", 28,"F"),
                new Employee(12, "Koel", 33000, "Railway", 39,"F"),
                new Employee(13, "mimi", 55000, "IT", 34,"F"));

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

        //Flatmap.........................
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
