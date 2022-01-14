package TestNG;
/*  Assert --> check points / validating points
               This is hard assert
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class8_Assertion {
    WebDriver driver;

    @BeforeClass
    void openBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\Software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.rediff.com");
    }
    @Test(priority = 1)
    public void critical(){
        String expectedOutput = "learning in English";
        String actualOutput = "learning in English and Hindi";
        Assert.assertEquals("actualOutput","expectedOutput");
    }

    @Test(priority = 2)
    public void high(){
        boolean b1 = 1<2;
        boolean b2 = 2>3;
        Assert.assertTrue(b1!=b2,"3 is greater than 2");
    }

    @Test(priority = 3)
    public void medium(){
        Assert.fail();
    }

    // assertTrue() method --> validating condition is true or not
    @Test(priority = 4)
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("//div[@class= 'cell']/child::span[1]"));     // storing logo element address
        Assert.assertTrue(logo.isDisplayed(), "Logo is not present");   // if it is true, the test will pass otherwise printing the fail message
    }

    // assertEquals() method --> checks equality
    @Test(priority = 5)
    void homePageTitle(){
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"Rediff");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
