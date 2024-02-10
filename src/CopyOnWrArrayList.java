import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrArrayList {

    public static void main(String[]args)
    {
        CopyOnWriteArrayList<Integer> list =new CopyOnWriteArrayList<>();

        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);

        for(Integer i : list)
        {
            list.add(5);
            System.out.println(i);
        }
    }
}
