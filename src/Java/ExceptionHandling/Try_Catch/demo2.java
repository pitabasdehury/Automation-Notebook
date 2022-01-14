package Java.ExceptionHandling.Try_Catch;

// multiple catch block

public class demo2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;                      // Here the first exception occurs
            System.out.println(a[10]);      // so java will not check this exception
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
