package Java.ExceptionHandling.throw_Keyword.Custom_Exception;

public class Test {
    public static void main(String[] args) {
        validatingNumber(11);
    }

    // the custom exception has to be thrown inside try-catch block
    static void validatingNumber(int number){
        try {
            if (number<1 || number>10){
                throw new InvalidNumberException();
            }
        }
        catch (InvalidNumberException e){
            System.out.println(e);
        }
    }
}
