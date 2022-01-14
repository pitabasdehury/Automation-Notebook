package Java;

public class demo {

    static int add(int n){
        int sum = 0;
        for (int i = 1; i<=n;i++){
            sum += i;
        }
        return sum;
    }
    static int add_dup_recurtion(int n){
        if (n==1){
            return 1;
        }
        return n + add_dup_recurtion(n-1);
    }
    static  void  parten(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void parten_recu(int n){
        if (n>=1) {
            parten_recu(n-1);
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void factorisation(int n){
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factoriszation of the given number is : "+fact);

    }
    static int factorization_recu(int n){
        if (n==1){
            return 1;
        }
        return n* factorization_recu(n - 1);
    }


    public static void main(String[] args) {

         // System.out.println("The sum of first n numbers is : "+add(10));

        // parten(10);

        // parten_recu(5);

        // System.out.println("The sum of first n numbers is : "+add_dup_recurtion(10));

       // System.out.println("Factoriszation of the given number is : "+factorization_recu(5));

        // factorisation(6);

        employee em1  = new employee();
        /*
        em1.getDetails(101,"Pitabas Dehury",20000);
        System.out.println();
        em1.getDetails(102, "Bibhuti Bhsan Dehury", 30000);
        */

        /*
        em1.emp_name("Pitabas Dehury", "Bibhuti Bhusan Dehury", "Manoj Mahanta");
        em1.emp_name("Bapuni Mahanta", "Deepak Mahanta");
         */

        /*
        em1.sum(2,3);
        em1.sum(4,8,10,12);
        */

    }
}
class employee{

    public void getDetails(int id, String name, int salary){

        System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary);

    }

    public void emp_name(String...arr){

        for (String name:arr)
            System.out.println("Name : "+name);
    }

    void sum(int...arr){
        int result =0;
        for (int a:arr)
            result += a;
        System.out.println("The sum is : "+result);

    }
}