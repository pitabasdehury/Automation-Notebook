package Java.AccessModifier.Protected.Package1;

public class Student {
    protected static int number = 300;
    protected int number1 = 1;
    protected int number2 = 2;


    protected void sum() {
        int number3 = 3;
        int number4 = 4;
        int sum = number3 + number4;
        System.out.println("Sum is "+sum);
    }


    public static void main (String[]args){

        System.out.println("This is a static value : "+number);

        Student st = new Student();
        st.sum();

        int sum = st.number1 + st.number2;
        System.out.println("Sum2 is "+sum);

    }
}
