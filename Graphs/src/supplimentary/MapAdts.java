package supplimentary;

import java.util.*;

public class MapAdts
{
    public static void main(String [] args)
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1111);
        map.put("B",12);
        map.put("C",13);
        map.put("D",14);
        map.put("F",15);

        int value=map.get("A");
        if(map.containsKey("A"))
        {
            System.out.println("value with respect to key A : "+map.get("A"));
        }
        if(map.containsValue(1111))
        {

            //finding key with respect to value
            Set<String> set=map.keySet();
            Iterator<String> it=set.iterator();
            while (it.hasNext())
            {
                String key=it.next();
                if(map.get(key).equals(1111))
                {
                    System.out.println("Key found : "+key);
                    break;
                }
            }

        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {

            System.out.println(entry.getKey()+" : "+entry.getValue());

        }

    }
}
