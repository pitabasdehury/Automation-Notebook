package Java.Polymorphim.methodOverloading;

class Class1{
    public void check(){
        System.out.println("This is first class.");
    }
}

class Class2 extends Class1 {
    public void check(String name){
        System.out.println("This is second class "+name);
    }
}

public class Test2 {
    public static void main(String[] args) {
        // Static (compile-time) polymorphism --> at the time of compilation java will decide which method will run
        Class2 obj = new Class2();
        obj.check("Pitabas");
        obj.check();

        Class1 obj2 = new Class1();
        obj2.check();
//        obj2.check("Pitabas");  --> this method will not run because this methods is not in Class1_SingleKeyword
                                    // Here java is deciding which method will run or which will not.

    }
}
