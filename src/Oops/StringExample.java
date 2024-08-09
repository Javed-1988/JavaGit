package Oops;

import java.util.HashMap;

public class StringExample {

    public HashMap<Integer,Character> findFirstOccurence(String str)
    {
        HashMap<Integer,Character> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c))
            {
                map.put(i,c);
                break;
            }

        }
        return map;
    }

    public static void main(String[]args)
    {
        StringExample s =new StringExample();
        HashMap<Integer,Character> map =s.findFirstOccurence("HelloWorldelloorld");
        map.forEach((k,v)->System.out.println(k+" "+v));

    }
}
