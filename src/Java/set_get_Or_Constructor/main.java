package Java.set_get_Or_Constructor;

public class main {
    public static void main(String[] args) {
        /*
        employee ob = new employee();
        ob.setData1();
        ob.getData1();

        ob.setData2();
        ob.getData2();

         */
        /*
        employee2 ob2 = new employee2();
        ob2.getData();

         */
      /* employee3 ob4 = new employee3(104,"Deepak Kumar Mahanta");
        ob4.display();
      employee3 ob5 = new employee3(105,"Bapuni Kumar Mahanta",26);
        ob5.display();
        employee3 ob6 = new employee3(copy);

       */


        employee4 ob5 = new employee4(106,"Kshirod Nayak",29);
        employee4 ob6 = new employee4(ob5);
        ob5.display();
        System.out.println();
        ob6.display();



    }
}
