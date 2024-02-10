
//class CustomException extends RuntimeException
//{
//    public CustomException(String msg)
//    {
//        super(msg);
//    }
//}

import java.io.FileNotFoundException;
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
     void display() throws ArithmeticException
    {
        System.out.println("hi");
    }
}
class B extends  Example{
    @Override
     void display()
    {
        System.out.println("hi");
    }

}


public class Excepttion {
    public static void main(String []args)
    {
//        Example example = new Example();
//        try {
//            example.performAction(-5); // This will throw CustomException
//        } catch (CustomException e) {
//            System.out.println("Custom exception caught: " + e.getMessage());
//        }
        try
        {
            return;
        }
        finally {
            System.out.println("finally");
        }
    }
}
