package Oops;

interface  P
{
     default void  defaultMethod()
    {
        System.out.println("Parent Default method");
        privateMethod();
    }
    private void  privateMethod()
    {
        System.out.println("Parent Private method");
    }
    static void  staticMethod()
    {
        System.out.println("Parent Static method");
    }
}

interface C
{
     default void  defaultMethod()
    {
        System.out.println("Child Default method");
        privateMethod();
    }
    private void  privateMethod()
    {
        System.out.println("Child Private method");
    }
    static void  staticMethod()
    {
        System.out.println("Child Static method");
    }
}

class Imp implements P,C{
    @Override
    public void defaultMethod() {
        P.super.defaultMethod();
    }
}


public class Practice {

    public static void main(String[]args)
    {
        Imp imp=new Imp();
        imp.defaultMethod();
        P.staticMethod();
        C.staticMethod();
    }

}
