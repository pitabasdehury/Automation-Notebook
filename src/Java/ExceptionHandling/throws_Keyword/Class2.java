package Java.ExceptionHandling.throws_Keyword;

// using custom method of Class1_SingleKeyword and handling exception if occurs

public class Class2 {
    public static void main(String[] args) {
        try {
            int r = Class1.divide(6,0);
            System.out.println("Result is : "+r);
        }catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
    }
}
