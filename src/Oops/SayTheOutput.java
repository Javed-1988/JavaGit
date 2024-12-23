package Oops;

public class SayTheOutput {
    public static void print(Object o)
    {
        System.out.println("Object--"+o);
    }
    public static void print(String s)
    {
        System.out.println("String--"+s);
    }

    public static void main(String[]args)
    {
        print(null);

    }
}
