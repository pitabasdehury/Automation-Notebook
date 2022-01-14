package Selenium.Class16_Screenshot;

/* To capture specific portion of the web-page....
            1. Locate the specific portion by locator and store it in WebElement
            2. Using the WebElement call getScreenshotAs() method and store ing File class reference

 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Class2_SpecificPortionScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement featuredProduct = driver.findElement(By.xpath("//div[@class = 'page-body']/div[4]"));
        File sourceFile = featuredProduct.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(".\\Screenshots\\featuredProduct.png");
        FileUtils.copyFile(sourceFile,targetFile);
    }
}