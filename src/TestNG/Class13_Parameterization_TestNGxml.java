package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class Class13_Parameterization_TestNGxml {
    WebDriver driver;
    @Test
    @Parameters({"Browser", "url", "username", "password"})
    public void Facebook_LogIn(String Browser, String url, String username, String password){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");

        if (Browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }else if (Browser.equals("FireFox")){
            WebDriverManager.firefoxdriver().setup();
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();


    }
}
