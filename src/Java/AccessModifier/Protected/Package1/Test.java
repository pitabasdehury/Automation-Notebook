package Java.AccessModifier.Protected.Package1;

public class Test {
    public static void main(String[] args) {

        //static variable or static method can be call in another class by their class name
        System.out.println("Number is : "+ Student.number);

        // object must be created for non-static
        Student st = new Student();
        st.sum();
        System.out.println("Number1 is : "+st.number1);
        System.out.println("Number2 is : "+st.number2);

    }
}
