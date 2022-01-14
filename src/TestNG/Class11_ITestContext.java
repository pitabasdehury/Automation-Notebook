package TestNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Class11_ITestContext {
    /*      ITestContext
        * It is an interface
        * Purpose : Within the same java file or Class file, it helps sharing data within the test cases
    */

    @Test(priority = 1)
    public void setUp(ITestContext context){    //  Passing the object reference of the interface ITestContext inside the method body
        System.out.println("This is set up of our new laptop.");
        context.setAttribute("Window10","Asus");        // setting data
        System.out.println();
    }

    @Test(priority = 2, dependsOnMethods = "setUp")
    public void logic(ITestContext context){
        System.out.println("This is the logical functioning of our new laptop.");
        String operatingSystem = (String) context.getAttribute("Window10");     //  getting data from setUp test case and storing in String variable
        System.out.println("Getting data from setUp test case into logic test case : "+operatingSystem);
        context.setAttribute("Complex","DevOps + Agile");       //  setting data
        System.out.println();
    }

    @Test(priority = 3, dependsOnMethods = {"setUp", "logic"})
    public void exit(ITestContext context){
        System.out.println("This is exit of our new laptop.");
        String operatingSystem = (String) context.getAttribute("Window10");     //  getting data from setUp test case and storing in String variable
        System.out.println("Getting data from setUp test case in logic test case : "+operatingSystem);
        String logicComplexity = (String) context.getAttribute("Complex");      //  getting data from logic test case and storing in String variable
        System.out.println("Getting data from logic test case into exit test case : "+logicComplexity);
        System.out.println();
    }
}
