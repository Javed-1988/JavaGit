import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurHashMap {

    public static void main(String[]args)
    {
        //ConcurrentHashMap<Integer,String> map= new ConcurrentHashMap<>();
        HashMap<Integer,String> map= new HashMap<>();
        //Hashtable<Integer,String> map= new Hashtable<>();
        //Collections.synchronizedMap(map);

        map.put(1,"Jav");
        map.put(2,"Jak");
        map.put(3,"Jam");

        for(Map.Entry m: map.entrySet())
        {
            map.put(4,"Javed");
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
