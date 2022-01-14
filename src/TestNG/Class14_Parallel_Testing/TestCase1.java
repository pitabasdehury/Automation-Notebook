package TestNG.Class14_Parallel_Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://gmail.com");
    }

    @Test(priority = 1)
    public void check_gmail_url(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }

    @Test(priority = 2)
    public void check_logo(){
        WebElement logo = driver.findElement(By.xpath("//h1[@id = 'headingText']/child::span"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }



}
