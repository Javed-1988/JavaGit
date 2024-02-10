@FunctionalInterface
interface functional
{
    void display(int...a);
}


public class Lambda {

    public static void main(String[]args)
    {
        functional f=(a)->{
            int k=0;
            for (int i = 0; i < a.length; i++) {
                k=k+a[i];

            }
            System.out.println("Addition: " + k);


        };
        f.display(10,7);
        f.display(10,7,5,1);
    }
}
