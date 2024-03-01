package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamFunctions {
    public static void main(String[]args)
    {
        List<Address> address= Arrays.asList(new Address("kolkata"),new Address("shapoorji"));
        List<Address> address1= Arrays.asList(new Address("gushkara"),new Address("shantipur"));
        List<Address> address2= Arrays.asList(new Address("gushkara"),new Address("Busstand"));
        List<Address> address3= Arrays.asList(new Address("gushkara"),new Address("sirishtala"));
        List<Address> address4= Arrays.asList(new Address("gushkara"),new Address("police fari"));
        List<Address> address5= Arrays.asList(new Address("gushkara"),new Address("girls school"));

        Employee emp=new Employee(1,"mahmood",35,50000,"IT",address);
        Employee emp1=new Employee(2,"jaga",38,50000,"SALE",address1);
        Employee emp2=new Employee(3,"balo",34,50000,"EVENT",address2);
        Employee emp3=new Employee(4,"soumen",40,50000,"SALE",address3);
        Employee emp4=new Employee(5,"sougata",37,50000,"RAILWAY",address4);
        Employee emp5=new Employee(6,"deepak",35,50000,"RAILWAY",address5);

        List<Employee> list=Arrays.asList(emp,emp1,emp2,emp3,emp4,emp5);
        //map method convert one type to one type here taking input as employee convert to string

//        list.stream().map(Employee::getName).map(String::toUpperCase)
//                .forEach(System.out::println);

        //flatMap flattering the map
//        list.stream().map(Employee::getAddress)
//                .flatMap(List::stream)
//                .forEach(System.out::println);

        //distinct give the unique value not give duplicate
        // list.stream().map(Employee::getAge).distinct().forEach(System.out::println);

        // count give count
        //long age=list.stream().map(Employee::getAge).distinct().count();
        // System.out.println(age);

        //sorted sort the element in alphabetical order
//        list.stream().map(Employee::getName).map(String::toUpperCase).sorted(Comparator.comparing(Employee::getAge).reversed())
//                .forEach(System.out::println);

        // element sort using comparator Ascending order
        //list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        // element sort using comparator Descending order
        //list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).map(Employee::getName).forEach(System.out::println);

        //filer function
        list.stream().filter(s->s.getAge()>35).forEach(System.out::println);


    }
}
