package JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Class8_ScrollOperation {
    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    @BeforeMethod
    public void openUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.twoplugs.com");
        javascriptExecutor = (JavascriptExecutor) driver;


    }

    @Test
    public void scrollingElement() {    // scroll down till the element found
        WebElement image = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", image);
    }

    @Test
    public void scrollingPage() {       // scroll down to last page
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
