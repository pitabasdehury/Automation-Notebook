package Java.Encapsulation.Concept1;

public class Student {
    private String name;
    private int age;
    private long accountNo;
    private long balance;

    // set method
    public void setStudentPersonalData(String name, int age){
        this.name = name;
        this.age = age;
    }

    // get method
    public void getStudentPersonalData(){
        System.out.println("Student name is "+name+" and age is "+age+" years old.");
    }

    // set method
    public void setStudentAccountData(long accountNo, long balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // get method
    public void getStudentAccountData(){
        System.out.println("Account no is "+accountNo+" and balance is "+balance);
    }
}
