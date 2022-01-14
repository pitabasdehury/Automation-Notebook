package Java.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();       // store any type of data
        hm1.put(101,"Pitabas");
        hm1.put(102,"Bibhuti");
        hm1.put(103,"Manoj");
        hm1.put(104,"Rajesh");
        System.out.println(hm1);
        hm1.put(101,"Jaga");    /* update the key value of 101 as Jaga
                                    Not-allowed --> duplicate keys
                                */
        System.out.println("After updating : "+hm1);

        hm1.put(105, "Manoj");      // values can be duplicated
        System.out.println("After adding duplicate value : "+hm1);

        System.out.println(hm1.get(102));       //  retrieve element by key

        // printing Map
        Set<Map.Entry<Integer,String>> entrySet = hm1.entrySet();
        for(Map.Entry<Integer,String> entry : entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


        HashMap <Integer, String> hm2 = new HashMap();  // specifying data-type of key and value inside angular bracket
    }
}
