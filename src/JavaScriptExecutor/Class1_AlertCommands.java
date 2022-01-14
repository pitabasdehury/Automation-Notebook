package JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Class1_AlertCommands {
    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    @BeforeMethod
    public void openUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    @Test
    public void demo1() {
        javascriptExecutor.executeScript("alert(\"Hello\")");   // alert() --> only display message
    }

    @Test
    public void demo2() {
        javascriptExecutor.executeScript("prompt(\"Enter your name\")");    // prompt() --> ask to enter data
    }
    @Test
    public void demo3() {
        javascriptExecutor.executeScript("confirm(\"Are you sure\")");    // confirm() --> asking confirmation
    }





}
