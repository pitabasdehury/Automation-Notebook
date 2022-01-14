package Selenium.Class9_HandleAlert;

// If you want to attach a file / upload a file from your computer then instead of .click() action use .sendKeys() method

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class2_Demo2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://html.com/input-type-file/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.id("fileupload")).sendKeys("D:\\Jaga\\interview.txt");
    }
}
