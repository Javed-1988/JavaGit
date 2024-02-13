package Oops;

class Parent2
{
    static void display()
    {
        System.out.println("Oops.Parent2 Static method");
    }

     private void pri()// can not override
    {
        System.out.println("Oops.Parent2 Private Method");
    }

}


public class MethodOverHiding extends Parent2{
    static void display()
    {
        System.out.println("Class Oops.MethodOverHiding static method");
    }
    private void pri()// can not override
    {
        System.out.println("Class Oops.MethodOverHiding Private method");
    }

    public static void main(String [] args)
    {
   Parent2.display();
   MethodOverHiding.display();
   Parent2 p2 =new MethodOverHiding();
   p2.display();
   MethodOverHiding p =new MethodOverHiding();
   p.pri();


    }


}
