package Java.Control_Statement.Break__Continue;

public class Demo {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            System.out.println(i);
            System.out.println("Java is great.");
            if(i==2){
                System.out.println("Ending the loop.");
                break;              // This will end the loop and continue with the next statement
            }
        }
        System.out.println("This loop ends here.");

        for(int i=0; i<=5; i++){
            if(i==2){
                System.out.println("Ending the loop.");
                continue;              /* The two print statements below continue will not be printed for i==2
                                            and jump to the next iteration i==3
                                       */
            }
            System.out.println(i);
            System.out.println("Java is great.");
        }
    }
}
