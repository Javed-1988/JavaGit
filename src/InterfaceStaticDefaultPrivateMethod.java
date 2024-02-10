interface Parent
{
    void abstractMethod();//need to implements by child class
    default void  defaultMethod()//need to implements by child class
{
    System.out.println("Default Method");
    privateMethod();

}
    static void  staticMethod()//no need child implementations we can call directly by interface name
    {
        System.out.println("static Method");

    }
    private void  privateMethod()//can not call directly from child class have to call from default method can not call inside static method
    {
        System.out.println("Private Method");
    }
}

interface Parent1
{
     void abstractMethod();//need to implements by child class
    default void  defaultMethod()//need to implements by child class
    {
        System.out.println("Default Method");
        privateMethod();

    }
    static void  staticMethod()//no need child implementations we can call directly by interface name
    {
        System.out.println("static Method");

    }
    private void  privateMethod()//can not call directly from child class have to call from default method can not call inside static method
    {
        System.out.println("Private Method");
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
      Child p=new Child();
      p.abstractMethod();
      Parent.staticMethod();
      p.defaultMethod();
      Child.staticMethod();



    }
}
