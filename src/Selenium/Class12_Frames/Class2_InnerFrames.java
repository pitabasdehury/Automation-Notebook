package Selenium.Class12_Frames;

// If there are more than iframes and one iframe is inside another iframe.......means outer iframe contains inner iframe

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class2_InnerFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        WebElement dualIFrame = driver.findElement(By.xpath("//a[@class = 'analystic' and contains(text(), 'Iframe with')]"));
        dualIFrame.click();

        WebElement outerFrame = driver.findElement(By.xpath("//div[@id = 'Multiple']/iframe"));     // identify outer iframe
        driver.switchTo().frame(outerFrame);                                                        // pass frame as webelement

        WebElement innerFrame = driver.findElement(By.xpath("//div[@class = 'row']/iframe"));
        driver.switchTo().frame(innerFrame);
        driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Pitabas Dehury");
    }
}
