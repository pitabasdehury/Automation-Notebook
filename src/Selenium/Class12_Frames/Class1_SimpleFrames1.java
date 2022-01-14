package Selenium.Class12_Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Class1_SimpleFrames1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();


        driver.switchTo().frame("packageListFrame");    // pass name of the frame and go to 1st frame
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        driver.switchTo().defaultContent();                 // go back to the main page


        driver.switchTo().frame("packageFrame");        // go to 2nd frame
        driver.findElement(By.xpath("//span[@class = 'interfaceName' and text()='WebDriver']")).click();
        driver.switchTo().defaultContent();


        driver.switchTo().frame("classFrame");          // go to 3rd frame
        WebElement interfaceWebDriver = driver.findElement(By.xpath("//h2[@class = 'title']"));
        Assert.assertTrue(interfaceWebDriver.isDisplayed(), "The element you are looking for is not available on the page.");


    }
}
