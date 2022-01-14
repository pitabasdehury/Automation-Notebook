package Java.AccessModifier.Private;

// private variables and methods can be accessible only within the class.

public class Student {
    private static int number = 300;
    private int number1 = 1;
    private int number2 = 2;

    private void sum() {
        int number3 = 3;
        int number4 = 4;
        int sum = number3 + number4;
        System.out.println("Sum is "+sum);
    }

        public static void main (String[]args){

        System.out.println("This is a static value : "+number);

        Student st = new Student();     // Accessing variables and methods within the class
        st.sum();

        int sum = st.number1 + st.number2;
        System.out.println("Sum2 is "+sum);

    }
}
