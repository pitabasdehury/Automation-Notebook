package Java.Keyword.Super;

// super can be used to invoke immediate parent class method.

public class demo2 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.work();
    }
}

class Animal2{
    void eat(){System.out.println("eating...");}
}

class Dog2 extends Animal2{
    @Override
    void eat(){System.out.println("eating bread...");}

    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }
}
