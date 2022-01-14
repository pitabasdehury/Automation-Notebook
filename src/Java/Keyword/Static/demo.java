package Java.Keyword.Static;

public class demo {

    // static methods and variables
    static int a;
    static int sum(int a, int b){
        return a + b;
    }

    // non-static methods and variables
    int b;
    int multiplication(int a, int b){
        return a * b;
    }

    // main method
    public static void main(String[] args) {
        System.out.println(a);      // accessing static variable and method directly
        sum(3,4);

        demo obj = new demo();      // accessing static variable and method by creating object of the Class1_SingleKeyword class
        System.out.println(obj.b);
        obj.multiplication(3,4);
    }
}
