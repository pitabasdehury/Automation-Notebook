package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class    Class8_Timeout_ImplicitlyWait_condition {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    /*  implicitlyWait works globally
                                                                                   means it will wait for each and every element in that particular page
                                                                              */

        driver.findElement(By.id("email")).sendKeys("9668510418");
        driver.findElement(By.id("pass")).sendKeys("Kala@1234");
        driver.findElement(By.name("login")).click();




    }
}
