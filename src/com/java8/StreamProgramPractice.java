package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamProgramPractice {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10, 20, 40, 55, 6, 30, 140, 5, 6);

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


        String str = "vghtresbmhjgggjgm";

        // Arrays element count.........
        //long a=list.stream().count();
        //System.out.println(a);

        //list sort ascending order..........
        //list.stream().sorted().forEach(System.out::println);
        //Collections.sort(list);
        //list.forEach(System.out::println);

        //list sort Descending order................
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //Collections.sort(list,Comparator.reverseOrder());
        //list.forEach(System.out::println);

        // Unique and duplicate element in list.............
        //Set<String> uniqueString = new HashSet<>();
        //Set<String> duplicateString = new HashSet<>();

        // list1.stream().filter(a->!uniqueString.add(a)).forEach(duplicateString::add);
        //duplicateString.forEach(System.out::println);

        /////max and min.....................
        //long a=list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        //System.out.println(a);

        // find second-highest value from list........................
        //list.stream().sorted(Comparator.comparing(Integer::intValue,Comparator.reverseOrder())).skip(1).limit(1).forEach(System.out::println);

        // List sort based on String length............
        //list1.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        //list1.stream().sorted(Comparator.comparing(String::length,Comparator.reverseOrder())).forEach(System.out::println);

        // Average sum...............
        //double a=list.stream().mapToInt(Integer::intValue).average().orElseThrow();
        //long a=list.stream().mapToInt(Integer::intValue).sum();
        //System.out.println(a);


        // String non repeat character and repeat character..............
        //str.chars().mapToObj(i->(char)i).filter(a->str.indexOf(a)==str.lastIndexOf(a)).forEach(b->System.out.println("charcater---"+b+" position--"+str.indexOf(b)));
        //Character c=str.chars().mapToObj(i->(char)i).filter(a->str.indexOf(a)==str.lastIndexOf(a)).findFirst().orElseThrow();

        //Character c=str.chars().mapToObj(i->(char)i).filter(a->str.indexOf(a)!=str.lastIndexOf(a)).findFirst().orElseThrow();

        //System.out.println("char--"+c+" position--"+str.indexOf(c));

        // sort employee based on age and name............
        //emp.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        //emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        //emp.stream().sorted(Comparator.comparing(Employee::getName,Comparator.reverseOrder())).forEach(System.out::println);
        //emp.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).forEach(System.out::println);

        // find name which age is highest............
        //String a=emp.stream().max(Comparator.comparing(Employee::getAge)).map(Employee::getName).orElseThrow();
        //List<Employee> empList=emp.stream().max(Comparator.comparing(Employee::getAge)).stream().toList();
        //List<Employee> empList=emp.stream().min(Comparator.comparing(Employee::getAge)).stream().toList();
        //empList.forEach(System.out::println);
        // long a=emp.stream().mapToInt(Employee::getAge).max().orElseThrow();
        // System.out.println(a);

        //find second-highest age in employee object.....
        //emp.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).skip(1).limit(1).forEach(System.out::println);


        //Counting Employee By Each Department...............
//        Map<String,Long> map=emp.stream().collect((Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
//        map.forEach((k,v)->System.out.println(k+v));

        //Distinct Department count............
        //long a=emp.stream().map(Employee::getDepartment).distinct().count();
        //System.out.println(a);

       // Department wise which age is highest and lowest..............
       // Map<String,Optional<Employee>> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getAge))));
//        Map<String,Optional<Employee>> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparing(Employee::getAge))));
//
//        map.forEach((k,v)->{
//            System.out.println("Department..."+k);
//            v.stream().map(Employee::getName).forEach(System.out::println);
//        });

        //Department wise employee name which name starts with ..........
//        Map<String, List<Employee>> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.filtering(a->a.getName().startsWith("b"),Collectors.toList())));
//
//        map.forEach((k,v)->{
//            System.out.println("Department..."+k);
//            v.stream().map(Employee::getName).forEach(System.out::println);
//        });

        //Department wise employee name which age is between ..........
//        Map<String, List<Employee>> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.filtering(a->a.getAge()>30 && a.getAge()<40,Collectors.toList())));
//
//        map.forEach((k,v)->{
//            System.out.println("Department..."+k);
//            v.stream().map(Employee::getName).forEach(System.out::println);
//        });

       //Find Each Department sort employee based on age and which age is second highest...........
//       Map<String, List<Employee>> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
////
//        map.forEach((k,v)->{
//            System.out.println("Department..."+k);
//            //v.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
//            //v.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).forEach(System.out::println);
//            //v.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).skip(1).limit(1).forEach(a->System.out.println(a.getName()));
//
//            //String name= v.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).skip(1).limit(1).map(Employee::getName).toString();
//
//        });

        //average age and sum of age by each department...............
       // Map<String, Double> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getAge)));
        //Map<String, Double> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getAge)));
        //map.forEach(((k,v)->System.out.println(k+"  value---"+v)));

        //find department name which has the highest age........
        //emp.stream().max(Comparator.comparing(Employee::getAge)).stream().forEach(a->System.out.println(a.getDepartment()));

        //Find department name which has the highest number of employee.............
        //Map<String,Long> map=emp.stream().collect((Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
        //map.entrySet().stream().max(Map.Entry.comparingByValue()).stream().forEach(System.out::println);




    }


}
