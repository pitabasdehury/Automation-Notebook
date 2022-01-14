package TestNG;
import org.testng.annotations.Test;

//  If have so many test cases and you want to execute some particular test cases, then make groups

public class Class15_Groups {

    @Test(priority = 1, groups = {"Regression"})
    public void test1(){
        System.out.println("This is test case 1.");
    }

    @Test(priority = 2, groups = {"Regression", "Smoke"})
    public void test2(){
        System.out.println("This is test case 2.");
    }

    @Test(priority = 3, groups = {"Sanity", "Smoke"})
    public void test3(){
        System.out.println("This is test case 3.");
    }

    @Test(priority = 4, groups = {"Regression", "Sanity"})
    public void test4(){
        System.out.println("This is test case 4.");
    }

    @Test(priority = 5, groups = {"Smoke"})
    public void test5(){
        System.out.println("This is test case 5.");
    }

    @Test(priority = 6, groups = {"Sanity"})
    public void test6(){
        System.out.println("This is test case 6.");
    }
}
