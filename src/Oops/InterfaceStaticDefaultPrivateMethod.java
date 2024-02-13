package Oops;

interface Parent
{
    void abstractMethod();//need to implements by child class
    default void  defaultMethod()//need to implements by child class
{
    System.out.println("Default Method Interface Oops.Parent");
    privateMethod();

}
    static void  staticMethod()//no need child implementations we can call directly by interface name
    {
        System.out.println("static Method Interface Oops.Parent");

    }
    private void  privateMethod()//can not call directly from child class have to call from default method can not call inside static method
    {
        System.out.println("Private Method Interface Oops.Parent");
    }
    private static void privateStaticMethod()
    {
        System.out.println("Private Static Method Interface Oops.Parent");
    }
}

interface Parent1
{
     void abstractMethod();//need to implements by child class
    default void  defaultMethod()//need to implements by child class
    {
        System.out.println("Default Method Interface Oops.Parent1");
        privateMethod();

    }
    static void  staticMethod()//no need child implementations we can call directly by interface name
    {
        System.out.println("static Method Interface Oops.Parent1");

    }
    private void  privateMethod()//can not call directly from child class have to call from default method can not call inside static method
    {
        System.out.println("Private Method Interface Oops.Parent1");
    }
    private static void privateStaticMethod()
    {
        System.out.println("Private Static Method Interface Oops.Parent");
    }
}


class Child implements Parent,Parent1
{

    public  void  abstractMethod()
    {
        System.out.println("Abstract Method");
    }
    @Override
    public void  defaultMethod()//need to implements by child class
    {
        System.out.println("Default Method Implements By Class");


    }

    private void privateMethod()
    {
        System.out.println("private Method in class");
    }
    static void staticMethod()
    {
        System.out.println("static Method in class");
    }


}

public class InterfaceStaticDefaultPrivateMethod {
    public static void main(String[]args)
    {
      Parent1 p=new Child();
      p.defaultMethod();
      p.abstractMethod();
      Parent.staticMethod();
      p.defaultMethod();
      Child.staticMethod();

    }
}
