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
        List<Integer> read=new ArrayList<>();
        read.add(1);
        read.add(3);
        read.add(2);
        read.add(4);
        List<Integer> write=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            try {
                write.add(i);
                read.forEach(a->System.out.println(a+" from thread "+number));
                //System.out.println(i+" from thread "+number);
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[]args) throws InterruptedException {




        for(int i=0;i<=5;i++) {
            ThreadExample t = new ThreadExample(i);
            //Thread t1 =new Thread(t);//if implements runnable interface
            t.start();
           // t.join();
        }

    }
}
