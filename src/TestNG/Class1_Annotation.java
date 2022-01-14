package TestNG;

import org.testng.annotations.*;

public class Class1_Annotation {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is a Before Suite annotation");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is a Before Test annotation");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is a Before Class annotation");
    }

    @BeforeMethod       // This method will execute multiple times before every test methods executes.
    public void beforeMethod(){
        System.out.println("This is a Before Method annotation");
    }

    @Test
    public void login_test(){
        System.out.println("This is a login window");
    }

    @Test
    public void close(){
        System.out.println("close this window");
    }

    @Test
    public void launch(){
        System.out.println("This will launch the window");
    }

    @AfterMethod           // This method will execute multiple times after every test methods executes.
    public void afterMethod(){
        System.out.println("This is a After Method annotation");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is a After Class annotation");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is a After Test annotation");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is a After Suite annotation");
    }
}