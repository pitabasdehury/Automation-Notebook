package JavaScriptExecutor.Class6_FlashingElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.twoplugs.com");

        WebElement joinFree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));

        flashDemo(joinFree, driver);
    }

    public static void flashDemo(WebElement element, WebDriver driver) throws InterruptedException {
        String bgColor = element.getCssValue("backgroundColor");

        for (int i = 0; i < 10; i++) {

            changeColor("#000000",element,driver);      // change to black color
            Thread.sleep(500);

            changeColor(bgColor,element,driver);            // change to the original background color
            Thread.sleep(500);

        }
    }

    public static void changeColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
    }
}