import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Collect {

    public static void man(String[]args)
    {
        ConcurrentHashMap<Integer,String> con = new ConcurrentHashMap<>();
        con.put(1,"jav");
        con.put(2,"jak");
        con.put(3,"jam");

        for (Map.Entry<Integer, String> entry : con.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
