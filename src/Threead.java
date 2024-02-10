

public class Threead extends Thread//implements Runnable
{

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[]args)
    {
        Threead t= new Threead();
        //Thread t1 =new Thread(t);//if implements runnable interface
        t.start();

    }
}
