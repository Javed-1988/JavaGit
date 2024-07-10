package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prac {

    public static void main(String[] args) {
        //String s="an ik a";
        //System.out.println(s.charAt(1));

//        for(int i=s.length()-1;i>=0;i--)
//        {
//
//            System.out.print(s.charAt(i));
//        }

//        for(int i= 0;i<s.length();i++) {
//            if (s.charAt(i) == ' ') {
//
//            } else {
//
//                System.out.print(s.charAt(i));
//            }
//        }

        List<Integer> list = Arrays.asList(10, 20, 40, 55, 6, 30, 140, 5);

        List<String> list1 = Arrays.asList("jak", "apple", "mahmood", "zahedi", "apple", "zahedi");
        List<String> list2 = Arrays.asList("apple", "samsung", "redmi", "oneplus", "motorola", "xiomi");

        List<Employee> emp = Arrays.asList(new Employee(1, "javed", 5000, "IT",35),
                new Employee(2, "mahmood", 25000, "IT",36),
                new Employee(3, "jaga", 10000, "HR",39),
                new Employee(4, "balo", 50000, "HR",34),
                new Employee(5, "soumen", 52000, "marketing",40),
                new Employee(6, "sougata", 70000, "Railway",42),
                new Employee(7, "deepak", 45000, "Railway",36),
                new Employee(8, "sumanta", 35000, "Railway",38));


       String str="vghtresvbmjgggjg";
//
//        int sum=0;
//        for(int i = 0; i<str.length();i++)
//        {
//            char ch=str.charAt(i);
//            sum=sum+Integer.parseInt(String.valueOf(ch));
//            System.out.println(sum);
//
//        }

//       long a= list.stream().count();
//       System.out.println(a);

//        Collections.sort(list);
//        list.forEach(System.out::println);
//        Collections.sort(list,Comparator.reverseOrder());
//        list.forEach(System.out::println);

//        Set<String> uniqueString=new HashSet<>();
//        Set<String> duplicateString=new HashSet<>();
//
//        list1.stream().filter(a->!uniqueString.add(a)).forEach(s->duplicateString.add(s));
//        duplicateString.forEach(System.out::println);

//        long a=list.stream().mapToInt(Integer::intValue).max().orElseThrow();
//        System.out.println(a);

        //list1.stream().sorted(Comparator.comparing(a->a.length(),Comparator.reverseOrder())).forEach(System.out::println);

//      Optional<Character> non=str.chars().mapToObj(i->(char)i).filter(s->str.indexOf(s)==str.lastIndexOf(s)).findFirst();
//      non.ifPresent(character -> System.out.println("first non repeat character: " + character+" position "+str.indexOf(character)));
      //str.chars().mapToObj(i->(char)i).filter(s->str.indexOf(s)==str.lastIndexOf(s)).forEach(System.out::println);

        //emp.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        //emp.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).map(a->a.getName()).forEach(System.out::println);

        //emp.stream().max(Comparator.comparing(Employee::getAge)).map(a->a.getName()).stream().forEach(System.out::println);

//      Map<String, Optional<Employee>> op=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getAge))));
//
//      op.forEach((k,v)->
//      {
//
//          System.out.println(k);
//          v.ifPresent(a->System.out.println(a.getName()));
//
//      });

//     Map<String,List<Employee>> op=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.filtering(a->a.getAge()>35 && a.getAge()<40,Collectors.toList())));
//        op.forEach((k,v)->
//        {
//
//            System.out.println(k);
//           v.forEach(a->System.out.println(a.getName()));
//
//        });

        Map<String,Long> op=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        Optional<Map.Entry<String, Long>> map=op.entrySet().stream().max(Map.Entry.comparingByValue());

        // Output the department with the highest number of students
        map.ifPresent(entry -> System.out.println("Department with highest number of students: " + entry.getKey() + " (" + entry.getValue() + " students)"));

//        Map<String, List<Employee>> op=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.filtering(a->a.getName().startsWith("b"),Collectors.toList())));
//
//        op.forEach((k,v)->
//        {
//
//            System.out.println(k);
//            v.forEach(a->System.out.println(a.getName()));
//
//        });

//        Map<String,Double> op=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//
//        op.forEach((k,v)->
//        {
//
//            System.out.println(k);
//            System.out.println(v);

       // });

//        Map<String, Long> op= emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        op.forEach((k,v)->
//        {
//
//            System.out.println(k);
//          System.out.println(v);
//
//                 });

//      Optional<Map.Entry<String, Long>> map=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
//              .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
//
//        Map.Entry<String, Long> entry = map.get();
//        System.out.println(entry.getKey()+entry.getValue());

//        Optional<Employee> a=emp.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).skip(1).findFirst();
//        a.ifPresent(s->System.out.println(s.getName()));





    }

}