package Java.Inheritance.InterfaceInheritance;

// multiple inheritance through interface

interface Interface1{
    public void meth1();
    public void meth2();
    default void greet(){   // If you want to add methods to Interface latter, then you have to use "default" keyword
        System.out.println("Good morning");
    }
}
interface Interface2{
    public void meth3();
    public void meth4();
}
class Class implements Interface1, Interface2{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Class MSC = new Class();
        MSC.meth1();
        MSC.meth2();
        MSC.meth3();
        MSC.meth4();
        MSC.greet();
    }
}
