package Java.AccessModifier.Protected.Package2;

import Java.AccessModifier.Protected.Package1.Student;

// protected methods or variables only can be accessible outside package by making sub-class (Inheritance)

public class Test extends Student{
    public static void main(String[] args) {

        //static variable or static method can be call in another class by their class name
        System.out.println("Number is : "+Student.number);

        // object must be created for non-static
        Test t = new Test();
        t.sum();
        System.out.println("Number1 is : "+t.number1);
        System.out.println("Number2 is : "+t.number2);



    }
}
