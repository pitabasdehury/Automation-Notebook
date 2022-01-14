package Java.Polymorphim.MethodOverriding;

public class BMW extends Car{

    @Override
    void start(){
//        super.start(); // can call start() method from parent class by super keyword
        System.out.println("BMW start with 0 speed");
    }

    // Overloaded method
    void start(int a){
        System.out.println("BMW start with "+a+" speed");
    }

    void color(){
        System.out.println("NICE COLOR!!!");
    }
}
