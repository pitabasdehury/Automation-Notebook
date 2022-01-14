package Selenium.Class16_Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Class1_FullpageScreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // taking screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;  // type-casting a class object to interface object
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);     /* getScreenshotAs() --> capture the screenshot
                                                                                    This method takes screenshot type as parameter
                                                                                    Means we have to specify the screenshot is a file or what
                                                                                  This returns a File object and store it in File reference
                                                                                  and we can not see this file so we need to copy this file to another file
                                                                              */
        File targetFile = new File("D:\\Software\\untitled\\Screenshots\\homepage.png");  // creating another file and and spectifing file-name
        FileUtils.copyFile(screenshotFile,targetFile);                  // copy the screenshotFile to another file



    }
}
