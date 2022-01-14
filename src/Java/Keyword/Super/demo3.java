package Java.Keyword.Super;

// super() can be used to invoke immediate parent class constructor

public class demo3 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
    }
}

class Animal3{
    Animal3(){System.out.println("animal is created");}
    Animal3(String animalColor){System.out.println("Animal color is "+animalColor);}
}

class Dog3 extends Animal3{
    Dog3(){
        super("black");
        System.out.println("dog is created");
    }
}
