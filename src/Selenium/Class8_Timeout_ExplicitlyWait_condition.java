package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Class8_Timeout_ExplicitlyWait_condition {

    public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public static void clickOn(WebDriver driver, WebElement element, int timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));

        sendKeys(driver,userName,10,"9668510418");
        sendKeys(driver,password,7,"Kala@1234");
        clickOn(driver,loginButton,5);

    }
}
