package com.java8;

import java.util.StringJoiner;

public class StringJoiners {

    public static void main(String[]args)
    {
        StringJoiner str =new StringJoiner(",");

        str.add("javed");
        str.add("jam");
        str.add("jak");
        str.add("Mahmood");

        System.out.println(str);


    }
}
