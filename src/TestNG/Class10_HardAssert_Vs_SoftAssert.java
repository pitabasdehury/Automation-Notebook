package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class10_HardAssert_Vs_SoftAssert {
    /*
        HardAssert : if found any wrong logic, then give exception
        SoftAssert : if found any wrong logic, then check all logic but don't give any exception.
                     To avoid this problem, assertAll() method has to be invoked
    */

    @Test
    public void HardAssertLogic(){
        System.out.println("This is my first hard assert statement");
        Assert.assertTrue(true);

        System.out.println("This is my second hard assert statement");
        Assert.assertTrue(false);

        System.out.println("This is my third hard assert statement");
        Assert.assertTrue(true);
    }

    @Test
    public void SoftAssertLogic(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("This is my first soft assert statement");
        softAssert.assertTrue(true);

        System.out.println("This is my second soft assert statement");
        softAssert.assertTrue(false);

        System.out.println("This is my third soft assert statement");
        softAssert.assertTrue(true);

        softAssert.assertAll();
    }

}
