package Java.Encapsulation.Concept2;

public class Student {
    private String name;
    private int age;
    private int accountNo;
    private long balance;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(int accountNo, long balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void displayStudentName(){
        System.out.println("Student name is "+name+" and age is "+age+" years old.");
    }
    void display_acc_balance(){
        System.out.println("Account no is "+accountNo+" and balance is "+balance);
    }
}
