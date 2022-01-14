package Java.ExceptionHandling.throw_Keyword.Custom_Exception;

// Creating custom exception

public class InvalidNumberException extends Exception{

    public InvalidNumberException(){
        super("Invalid number. It should between 1 and 10");
    }

    public InvalidNumberException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Entering wrong number";
    }

    @Override
    public String getMessage() {
        return "Number should be between 1 and 10";
    }
}
