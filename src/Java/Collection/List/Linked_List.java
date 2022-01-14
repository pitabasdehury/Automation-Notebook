package Java.Collection.List;

import java.util.Iterator;
import java.util.LinkedList;
/*
    * LinkedList is a class which implementing Link interface as well as Deque interface
    * LinkedList is a special collection or dynamic array which stores data
    * LinkedList is a data structure used to store data in linear form
 */
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(123);
        l2.add(127);
        //  l2.add("Jaga");
        System.out.println("l2 array is : " + l2);  // printing the content of LinkedList

        LinkedList<String> l3 = new LinkedList<>();   // String array
        l3.add("Jaga");
        l3.add("Kalia");
        l3.add("Manoj");
        System.out.println("l3 arrY is : "+l3);

        // addFirst()
        l3.addFirst("Rakesh");      // value will be added in the first of the array
        System.out.println("After addFirst method, l3 is : "+l3);

        // addLast()
        l3.addLast("Jatin");        // value will be added in the last of the array
        System.out.println("After addLast method, l3 is : "+l3);

        // get()
        System.out.println(l3.get(4)); // will print 4th index data of the array

        // set()
        l3.set(4,"Bapuni");  // will update 0th element as Bapuni by erasing Jatin
        System.out.println("After set() method, l3 is :"+l3);

        // removeFirst() --> remove first element from the array
        // removeLast() --> remove last element from the array
        // remove(Index) --> remove element on the basis of index

        // Printing all values of LinkedList
            // 1. using ForLoop
            System.out.print("Printing using ForLoop : ");
            for (int i=0; i<l3.size(); i++){
                System.out.print(l3.get(i));
                System.out.print(",");
            }
        System.out.println();

            // 2. using advanced ForLoop
            System.out.print("Printing using ForEach Loop :");
            for (String e:l3) {
                System.out.print(e);
                System.out.print(",");
            }
        System.out.println();

            // using while loop
            System.out.print("Printing using While Loop :");
            int i = 0;
            while(i<l3.size()){
                System.out.print(l3.get(i));
                System.out.print(",");
                i++;
            }
        System.out.println();

            /* using Iterator
                * Iterate means to repeat access of values from a collection
                * It is another interface that provides methods that can use to access element of a particular collection
            */

            System.out.print("Printing using Iterator :");
            Iterator<String> It = l3.iterator();    // storing l3.iterator() in iterator reference
            while (It.hasNext()) {
                System.out.print(It.next());
                System.out.print(",");
            }
    }
}
