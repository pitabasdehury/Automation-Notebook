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

public class Class4_RefreshCommand {

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
    public void demo() {
        // Enter mail id
        WebElement emailBox = driver.findElement(By.cssSelector("input#login-username"));
        javascriptExecutor.executeScript("arguments[0].value='pitabasdehury@gmail.com'", emailBox);

        // refresh the page
        javascriptExecutor.executeScript("history.go(0)");      // refresh command in selenium -->driver.navigate().refresh();
    }

    @AfterMethod
    public void closePage() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
