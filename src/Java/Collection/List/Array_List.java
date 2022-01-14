package Java.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class Employee{
    int age;
    String name;
    String dept;
    Employee(String name, int age, String dept){
    this.name = name;
    this.age = age;
    this.dept = dept;
    }
}
class Generic_ArrayList{
    public static <E> void checking() {
        ArrayList<Integer> l2 = new ArrayList<>();  // Generic Dynamic array, defining type of data-type
        l2.add(123);
        l2.add(127);
        //  l2.add("Jaga");     // Trows error --> because l2 is integer array
        System.out.println("l2 array is : " + l2);

        ArrayList<String> l3 = new ArrayList<>();   // String array
        l3.add("Jaga");
        l3.add("Kalia");
        l3.add("Manoj");            // or -->   ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("Jaga", "Kalia", "Manoj"))

        ArrayList<E> l4 = new ArrayList<E>();   // When you are not sure about which data-type values you are going to add
        l4.add((E) "pitabas");
    }
}
public class Array_List {
    public static void main(String[] args) {
        int a = 10;     // Storing a data in one variable
        int[] arr = new int[5];   /*
                                    * If you want to store more data in a single variable reference then you have to make a array
                                    * This is a static array means the array size is fixed and we can't change the size
                                  */
        arr[0] = 11;
        arr[4] = 15;
     // arr[5] = 16;    // Throws error - ArrayIndexOutOfBoundsException because array size is fixed

        ArrayList l1 = new ArrayList();  /*     Non-generic Dynamic array --> Array_List
                                          * To overcome fixed array problem we use Array_List
                                          * This is a dynamic array means we can add more data, delete, and many more
                                        */
        l1.add(21);
        l1.add(22);
//        System.out.println("Size of array is : "+l1.size()); // Checking the size of the array
//        System.out.println("Array is : "+l1);
        l1.add(25);
        l1.add(25);              //  It can contain duplicate values / elements also
        l1.add('c');             //  Different data-type values can be stored in non-generic Array_List
        l1.add("Pitabas Dehury");
        l1.add(12.93);
//        System.out.println("Size of array after adding value is : "+l1.size());
//        System.out.println("After adding array is : "+l1);
//        System.out.println("4th index value is : "+l1.get(4));   //  allow random access to retrieve value from the array

        l1.add(0,"Jaga");   // adding elements through index
        System.out.println("After addition value in array : "+l1);

        // addAll() method      // If you want to add all values of an arrayList to another arrayList
        ArrayList a1 = new ArrayList();
        a1.add("Jaga");
        a1.add("Kalia");
        System.out.println("a1 Array_List is : "+a1);

        ArrayList a2 = new ArrayList();
        a2.add("Manoj");
        a2.add("Rajesh");
        System.out.println("a2 Array_List is : "+a2);

        a1.addAll(a2);
        System.out.println("After adding, a1 Array_List is : "+a1);

        // sort() method   -->      sort the specified list into a natural ordering
        Collections.sort(a1);
        System.out.println("Sorting the a1 arrayList : "+a1);

        // shuffle() method  -->    shuffle the specified list
        Collections.shuffle(a1);
        System.out.println("Shuffling the a1 arraList : "+a1);

        // removeAll() method
        a1.removeAll(a2);   // If you want to remove a2 arraylist values from a1
        System.out.println("After removing, a1 arrayList is : "+a1);

        // retainAll() method --> If you want to check the common value
        ArrayList a3 = new ArrayList();
        a3.add("Jaga");
        a3.add("Kalia");

        ArrayList a4 = new ArrayList();
        a4.add("Manoj");
        a4.add("Jaga");

        a3.retainAll(a4);
        System.out.println(a3);

        // How to store specific user-defined class object in ArrayList ??
        Employee e1 = new Employee("Pitabas",27,"CompScience"); // Creating Employee class objects
        Employee e2 = new Employee("Bibhuti",27,"Math");
        Employee e3 = new Employee("Manoj",26,"HR");
        ArrayList<Employee> a5 = new ArrayList<>();         /*  Storing Employee objects in ArrayList
                                                                * to store you have to make this ArrayList employee type
                                                                *
                                                            */
        a5.add(e1);
        a5.add(e2);
        a5.add(e3);

        Iterator<Employee> iterator = a5.iterator();
        while (iterator.hasNext()){ // hasNext() will check whether any next value is available or not in the Iterator
            Employee emp = iterator.next(); // Returns the next value of the Iterator
            System.out.println(emp.name+"," +emp.age+"," +emp.dept);
        }

        // convert an array to arrayList
        String name[] = {"Pitabas", "Jaga", "Kalia"};   //   creating an array
        ArrayList a6 = new ArrayList(Arrays.asList(name));   // converting
        System.out.println("After converting to arrayList : "+a6);
    }
}
