package JavaPractice;

// Recurtion is a way to repeat a method within itself

public class Class4_Recursion {
    static  int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n-1);  // Here the method call itself
        }
    }


 /*   static  int factorial(int n){   // This is iterative way of recursion using For_Loop
        int product = 1;
        for (int i=1; i<=n; i++){
            product *= i;
        }
        return product;
    }
 */
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Factorial of "+x+" is "+factorial(x));
    }

}
