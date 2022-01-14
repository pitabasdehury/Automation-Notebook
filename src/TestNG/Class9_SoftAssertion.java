package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class9_SoftAssertion {
//  You have to create an object of  SoftAssert class
//  At the end of the test case, when all the logic is completed, invoke the method assertAll()

    @Test
    public void validation1(){
        SoftAssert softAssert1 = new SoftAssert();                           // creating object of SoftAssert class
        int i = 20; int j = 25;
        System.out.println("Sum of first test case is : "+(i+j));           //  logic
        softAssert1.assertTrue(true);                              //  soft assertion or validation

        boolean b1 = 1<2;    // true
        boolean b2 = 2>3;    // false
        softAssert1.assertEquals(b2,b1,"b2 is a wrong statement");  /*  SoftAssert check all logics inside a test case
                                                                                but don't give any exception
                                                                                despite presence of wrong logic
                                                                            */
    }

    @Test
    public void validation2(){
        SoftAssert softAssert2 = new SoftAssert();
        int i = 10; int j = 15;
        System.out.println("Sum of second test case is : "+(i+j));
        softAssert2.assertTrue(true);

        boolean b1 = 1<2;    // true
        boolean b2 = 2>3;    // false
        softAssert2.assertEquals(b2,b1,"b2 is a wrong statement");

        softAssert2.assertAll();                                        /* If there is any wrong logic inside a test case,
                                                                           then assertAll() method give exception
                                                                        */
    }
}
