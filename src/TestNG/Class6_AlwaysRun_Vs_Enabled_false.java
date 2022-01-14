package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

// < enabled = false > is more powerful than < alwaysRun = true >

public class Class6_AlwaysRun_Vs_Enabled_false {

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

    @Test(priority = 3, dependsOnMethods = {"login_test", "launch"}, alwaysRun = true, enabled = false)
    public void logout(){
        System.out.println("This is logout window");
    }
}
