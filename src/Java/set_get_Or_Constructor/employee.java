package Java.set_get_Or_Constructor;

public class employee {
        int id;
        String name;

        void setData1(){
            id = 101;
            name = "Pitabas";
        }
        void getData1(){
            System.out.println("ID is "+id+" & name is "+name);
        }

        void setData2(){
            id = 102;
            name = "Bibhuti Bhusan Dehury";
        }
        void getData2(){
            System.out.println("ID is "+id+" & name is "+name);
        }
    }

class employee2{
    int id;
    String name;

    employee2(){    // Creating Constructor
        id = 103;
        name = "Manoj Kumar Mahanta";
    }
    void getData(){
        System.out.println("ID is "+id+" & name is "+name);
    }

}

class  employee3{
    int id;
    String name;
    int age;
    employee3(int i, String n){     // Creating Constructor
        id = i;
        name = n;
    }
    employee3(int i, String n, int age){    // Constructor overloading
        id = i;
        name = n;
        this.age = age;
    }
    void  display(){
        System.out.println(+id+" "+name+" "+age);
    }
}

class employee4{
    int id;
    String name;
    int age;

    employee4(int id, String name, int age){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    employee4(employee4 copy){
        this.id = copy.id;
        this.name = copy.name;
        this.age = copy.age;
    }
    void display(){
        System.out.println("ID : "+id+"\n\t"+name+"\n\t"+age+"(age)");
    }
}
