package TestNG;

import org.testng.annotations.*;

// If you do not want to run a particular test , then use : enabled = false

public class Class3_Enabled_false {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is a Before Method");
    }

    @Test(priority = 1)
    public void login_test(){
        System.out.println("This is a login window");
    }

    @Test(priority = 3, enabled = false)        // If you don't want to run this test, use enabled = false
    public void close(){
        System.out.println("close this window");
    }

    @Test(priority = 2, enabled = true)
    public void launch(){
        System.out.println("This will launch the window");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is a After Method annotation");
    }

}
