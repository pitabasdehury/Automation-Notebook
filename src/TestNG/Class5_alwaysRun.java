package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

// alwaysRun = true -- (When TestNG skips execute of a test for whatever reason and you want that test case to be executed then we use alwaysRun = true)

public class Class5_alwaysRun {

    @Test(priority = 1)
    public void login_test(){
        System.out.println("This is a login window");
    }

    @Test(priority = 4, enabled = true, dependsOnMethods = {"login_test", "launch"})
    public void close(){
        System.out.println("close this window");
    }

    @Test(priority = 2, enabled = true, dependsOnMethods = "login_test")
    public void launch(){
        System.out.println("This will launch the window");
        Assert.fail();
    }

    @Test(priority = 3, dependsOnMethods = {"login_test", "launch"}, alwaysRun = true)
    public void logout(){
        System.out.println("This is logout window");
    }

}
