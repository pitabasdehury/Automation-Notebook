package Java.Keyword.Super;

// super() can be used to invoke immediate parent class constructor.

public class demo1 {
    public static void main(String[] args) {
        Dog1  dog = new Dog1();
        dog.printColor();
    }
}

class  Animal1{
    String color = "White";
}

class Dog1 extends Animal1{
    String color = "Black";
    void printColor(){
        System.out.println(color);          // print color of Dog class
        System.out.println(super.color);    // print color of Animal class
    }
}
