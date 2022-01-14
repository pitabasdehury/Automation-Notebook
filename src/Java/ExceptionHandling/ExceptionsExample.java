package Java.ExceptionHandling;

public class ExceptionsExample {
    public static void main(String[] args) {
        System.out.println("Started");

//        Thread.sleep(2000); // throws InterruptedException --> identified by the compiler

        // Un-checked Exception   --> identified at the run time
        int i = 10;
        System.out.println(i/0);  //  ArithmeticException

        String a = null;
        System.out.println(a.length()); // NullPointerException

        String s1 = "12345";
        int i1 = Integer.parseInt(s1);  // If we have numeric value in the form of string, then it can be changed to string
        System.out.println(i1);
        String s2 = "abcde";
        int i2 = Integer.parseInt(s2);  //NumberFormatException
        System.out.println(i2);         // we can not change string value into number format

        String[] st = new String[5];
        st[7] = "Pitabas";              // ArrayIndexOutOfBoundsException

        System.out.println("stopped");
    }
}
