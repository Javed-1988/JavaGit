class In
{
public void display(int...data)
{
    int i=0;
    for(int num: data)
    {
        i=num+i;

    }
    System.out.println("data"+i);
}
}


public class Inherritance {
    public static void main(String[]args)
    {

        In in = new In();
        in.display(10,20);
        in.display(10,20,45);

    }
}
