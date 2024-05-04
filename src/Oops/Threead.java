package Oops;

public class Threead extends Thread//implements Runnable
{
    int number;
    public Threead(int number)
    {
        this.number=number;
    }

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                System.out.println(i+" from thread "+number);
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
            Threead t = new Threead(i);
            //Thread t1 =new Thread(t);//if implements runnable interface
            t.start();
           // t.join();
        }

    }
}
