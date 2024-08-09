package com.java8;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> con= System.out::println;
        con.accept("Hello");
        Supplier<Date> sup=Date::new;
        System.out.println(sup.get());

    }
}
