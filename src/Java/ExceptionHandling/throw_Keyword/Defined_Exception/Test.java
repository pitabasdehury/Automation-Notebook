package Java.ExceptionHandling.throw_Keyword.Defined_Exception;

public class Test {
    public static void main(String[] args) {
        validateAge(19);
    }

    public static void validateAge(int age) {
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}
