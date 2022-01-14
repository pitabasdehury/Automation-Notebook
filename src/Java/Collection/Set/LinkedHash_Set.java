package Java.Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHash_Set {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Pitabas");
        lhs.add("Bibhuti");
        lhs.add("Manoj");
        lhs.add("Rajesh");
        lhs.add("Rajesh");      // duplicates are not allowed

        System.out.println(lhs);    // print lhs values based on insertion

    }
}
