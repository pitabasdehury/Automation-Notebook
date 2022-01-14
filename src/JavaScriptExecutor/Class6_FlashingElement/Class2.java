package JavaScriptExecutor.Class6_FlashingElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.twoplugs.com");


        WebElement joinFree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));

        flashDemo(joinFree,driver);

    }

    public static void flashDemo(WebElement element, WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgColor = element.getCssValue("backgroundColor");


        for (int i=0; i<10; i++){

            js.executeScript("arguments[0].style.backgroundColor='#000000'", element);      // change to black color
            Thread.sleep(500);

            js.executeScript("arguments[0].style.backgroundColor='"+bgColor+"'",element);   // change to the original background color
            Thread.sleep(500);

        }
    }
}
