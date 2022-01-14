package JavaPractice;

public class Class3_VarArgs {
/*    static  int sum(int x, int y){  // Adding two numbers
        int result = x + y;
        return result;
    }
*/

/*    static  int sum(int x, int y, int z){   // Adding three numbers
        int result = x + y + z;
        return result;
    }
*/

/*    static  int sum(int ...arr){   // To avoid multiple overloaded methods of different parameters of same datatype, we use VarArgs (method) concept
                                  //  Here we make a int array
        int result = 0;
        for (int i:arr) {
            result += i;
        }
        return result;
    }
*/

    static  int sum(int x, int ...arr){   // If you want a compulsory argument in our method
        int result = x;                   // You  want to add all numbers with your-defined argument
        for (int i:arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("Sum of nothing is "+sum());
//        System.out.println("Sum of given numbers is "+sum(4,5));
//        System.out.println("Sum of given numbers is "+sum(4,5,6));
//        System.out.println("Sum of given numbers is "+sum(3,4,5,6));
        System.out.println("Sum of given numbers is "+sum(3,4,5,6,7));
    }
}


