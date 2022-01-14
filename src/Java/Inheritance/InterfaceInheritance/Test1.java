package Java.Inheritance.InterfaceInheritance;

interface SampleInterface{
    public void meth1();
    public void meth2();
    default void greet(){   // If you want to add methods to Interface latter, then you have to use "default" keyword
        System.out.println("Good morning");
    }
}
interface ChildSampleInterface extends SampleInterface{   // An Interface can extends another Interface but not a  Class
    public void meth3();                            // A Class implements Interface
    public void meth4();
}
class MySampleClass implements ChildSampleInterface{
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

public class Test1 {
    public static void main(String[] args) {
        MySampleClass MSC = new MySampleClass();
        MSC.meth1();
        MSC.meth2();
        MSC.meth3();
        MSC.meth4();
        MSC.greet();

    }
}
