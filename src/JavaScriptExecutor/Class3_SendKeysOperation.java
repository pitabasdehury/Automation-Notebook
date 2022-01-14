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

public class Class3_SendKeysOperation {
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
    public void demo2() {
        WebElement emailBox = driver.findElement(By.cssSelector("input#login-username"));
        javascriptExecutor.executeScript("arguments[0].value=arguments[1]", emailBox, "pitabasdehury@gmail.com");
    }

    @Test
    public void demo1() {
        WebElement emailBox = driver.findElement(By.cssSelector("input#login-username"));
        javascriptExecutor.executeScript("arguments[0].value='pitabasdehury@gmail.com'", emailBox);
    }

    @AfterMethod
    public void closePage() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
