package Java.ExceptionHandling.Try_Catch;

public class demo1 {
    public static void main(String[] args) {

        int i1 = 10;                                     // ArithmeticException
        try {
            System.out.println(i1/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        String a1 = null;                                 // NullPointerException
        try {
            System.out.println(a1.length());
            System.out.println("Rest of the code.");    // this statement will not be executed as the previous statement will throw an exception
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the code.");        // this statement will be executed


        int i2 = 10;                                     // when you don't know the exception name
        try {
            System.out.println(i2/0);
        }catch (Exception e){
            System.out.println("Can't divided by zero.");   // writing custom message on execution
        }
    }
}
