package Oops;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample extends Thread//implements Runnable
{

    int number;
    public ThreadExample(int number)
    {
        this.number=number;
    }

    public void run()
    {

            for (int i = 0; i < 10; i++) {
                try {

                    System.out.println(i*2 + " from thread " + number);
                    //Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

    }


    public static void main(String[]args) throws InterruptedException {

        for(int i=0;i<=5;i++) {
            ThreadExample t = new ThreadExample(i);
            //Thread t1 =new Thread(t);//if implements runnable interface
            t.start();
            //t.join();
        }

    }
}
