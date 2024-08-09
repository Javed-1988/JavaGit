package Oops;
//class CustomException extends RuntimeException
//{
//    public CustomException(String msg)
//    {
//        super(msg);
//    }
//}

import java.io.IOException;

class Example {
    // Method that may throw the custom exception
//    public void performAction(int value) {
//        if (value < 0) {
//            throw new CustomException("Value cannot be negative");
//        }
//        // Perform some action
//        System.out.println("Action performed successfully");
//    }
     void display() throws Exception
    {
        System.out.println("hi");
    }
}
class B extends  Example{

    // If parent class throws exception not necessary child class also throws exception but
    // child class can not throw broader exception than Parent class if Parent class does not throw any exception
    // then child class is only allowed to throw runtime exception not compile time exception
    @Override
     void display() throws IOException
    {
        System.out.println("hi");


    }

}


public class ExceptionExample {
    public static void main(String []args)
    {
//        Oops.Example example = new Oops.Example();
//        try {
//            example.performAction(-5); // This will throw CustomException
//        } catch (CustomException e) {
//            System.out.println("Custom exception caught: " + e.getMessage());
//        }
        try
        {
           int a=10/0;
           System.out.println("try");
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("catch block");
        }

        finally {
            System.out.println("finally");
        }


    }
}
