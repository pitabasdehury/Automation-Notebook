package JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Class2_ClickOperation {
    WebDriver driver = null;
    JavascriptExecutor javascriptExecutor;

    @BeforeMethod
    public void openUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com");
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    @Test
    public void demo1() {            // click operation with ID locator
        javascriptExecutor.executeScript("document.getElementById(\"persistent\").click()");
    }

    @Test
    public void demo2() {            // click operation with xpath locator
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='persistent']"));
        javascriptExecutor.executeScript("arguments[0].click()", checkBox);
    }

    @AfterMethod
    public void closePage() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
