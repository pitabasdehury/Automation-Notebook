package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5_Locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://Oracle.com");

        driver.findElement(By.className("acttxt")).click();                     // className Locator

        driver.findElement(By.xpath("//*[text() = 'Sign-In']")).click();        // xpath Locator

        driver.findElement(By.id("sso_username")).sendKeys("pitabasdehury@gmail.com");  // id Class5_Locator
        driver.findElement(By.id("ssopassword")).sendKeys("Kala@1234");
        driver.findElement(By.id("signin_button")).click();

        driver.findElement(By.className("acttxt")).click();

        driver.findElement(By.linkText("Pitabas Dehury")).click();               // linkText Locator

        driver.findElement(By.className("u02signout")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("u02signout")).click();

        driver.findElement(By.partialLinkText("Sign Ou")).click();               // partialLinkText Locator

        driver.close();
    }
}
