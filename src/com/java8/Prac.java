package JavaPractice.src.com.java8;

import JavaPractice.src.designpattern.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        List<Employee> emp = Arrays.asList(new Employee(1, "javed", 5000, "IT"),
                new Employee(2, "mahmood", 25000, "IT"),
                new Employee(3, "jaga", 10000, "HR"),
                new Employee(4, "balo", 50000, "HR"),
                new Employee(5, "soumen", 50000, "marketing"),
                new Employee(6, "sougata", 70000, "Railway"),
                new Employee(7, "deepak", 45000, "Railway"));

//          Collections.sort(list1,Comparator.reverseOrder());
//          list1.forEach(System.out::println);

//        long a=list1.stream().count();
//        System.out.println(a);
//        Set<String> uniqueStrings = new HashSet<>();
//        Set<String> duplicateStrings = new HashSet<>();
//        list1.stream().filter(s->!uniqueStrings.add(s)).forEach(duplicateStrings::add);
//        duplicateStrings.forEach(System.out::println);

        //list.stream().sorted().forEach(System.out::println);
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        OptionalInt a=list.stream().mapToInt(Integer::intValue).max();
//        System.out.println(a);
//
//        OptionalInt a=list.stream().mapToInt(Integer::intValue).min();
//        System.out.println(a);

//        OptionalDouble a=list.stream().mapToInt(Integer::intValue).average();
//        System.out.println(a);

//       long a= list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(a);

        //list1.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        //String str = "hytrhgtryedvgftrjkkv";
        //str.chars().mapToObj(i -> (char) i).filter(s1 -> str.indexOf(s1) == str.lastIndexOf(s1)).forEach(c -> System.out.println("character " + c + " position " + str.indexOf(c)));

//        Optional<Character> non = str.chars().mapToObj(i -> (char) i).filter(s1 -> str.indexOf(s1) == str.lastIndexOf(s1)).findFirst();
//        non.ifPresent((character -> System.out.println("char-----" + character + " Position-----" + str.indexOf(character))));

        //str.chars().mapToObj(i -> (char) i).filter(s1 -> str.indexOf(s1) != str.lastIndexOf(s1)).forEach(c -> System.out.println("character " + c + " position " + str.indexOf(c)));

       // emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(s->System.out.println(s));

        //emp.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed()).forEach(s->System.out.println(s));

       //emp.stream().max(Comparator.comparing(Employee::getSalary)).map(s->s.getName()+s.getSalary()).stream().forEach(s->System.out.println(s));

        //emp.stream().max(Comparator.comparing(Employee::getSalary)).stream().forEach(s->System.out.println(s));

        //emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary)))).forEach((k,v)->System.out.println(k+v));

        //emp.stream().map(s->s.getSalary()*1.2).forEach(System.out::println);

        //emp.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);


        emp.stream().filter(s->s.getSalary()>20000).collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k,v)->System.out.println(k+v));










    }

}