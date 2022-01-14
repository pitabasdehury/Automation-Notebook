package TestNG;

import org.testng.annotations.*;

public class Class2_Priority {

    @Test(priority = 1)
    public void login_test(){
        System.out.println("This is a login window");
    }

    @Test(priority = 3)
    public void close(){
        System.out.println("close this window");
    }

    @Test(priority = 2)
    public void launch(){
        System.out.println("This will launch the window");

    }


}
