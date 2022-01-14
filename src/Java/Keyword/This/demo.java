package Java.Keyword.This;

public class demo {

    // global variable
     static int a;
     static int b;

    // local variable
    int sum(int a, int b){
        this.a = a;
        this.b = b;
        return a + b;
    }

    // main method
    public static void main(String[] args) {

        demo obj = new demo();
        int result = obj.sum(2,4);  // calling sum method and storing in a int type variable
        System.out.println(result);

        System.out.println(a);
    }
}
