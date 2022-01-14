package Java.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();     /* default constructor
                                            default capacity is 16
                                            default load factor is 0.75
                                        */
        HashSet hs2 = new HashSet(100);     // initial capacity of the collection is 100
        HashSet hs3 = new HashSet(100, 0.82f);     // define load factor


        hs1.add("Pitabas");
        hs1.add("Bibhuti");
        hs1.add("Manoj");
        hs1.add("Rajesh");
        hs1.add("Rajesh");  // duplicate values are not allowed


        // To print Set collection

        // 1. using iterator() method
        Iterator<String> names = hs1.iterator();
        if (names.hasNext()){
            System.out.println(names.next());
        }

        // 2. Using For...each loop
        for(Object name : hs1){
            System.out.println(name);
        }


        System.out.println(hs1);  // print hs1 values randomly.


    }
}
