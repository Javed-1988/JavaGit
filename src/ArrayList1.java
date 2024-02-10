import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

    public static void main(String[]args)
    {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(3);
        list.add(30);
        list.add(29);
        list.add(11);
        list.add(54);
        list.add(5);

        //Collections.sort(list);//sort Ascending order
        ArrayList<Integer> list1 = new ArrayList<>(list);
        list1.forEach(s1->System.out.println("copy of arraylist"+s1));
        list.sort(Collections.reverseOrder());// sort descending order
        System.out.println("maximum num"+Collections.max(list));//max
        System.out.println("minimum num"+Collections.min(list));//min
        list.forEach(s->System.out.println(s));

//        for(Integer a:list)
//        {
//            //list.add(7);
//            System.out.println(a);
//        }





    }
}
