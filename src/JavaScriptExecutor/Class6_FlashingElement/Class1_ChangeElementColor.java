package JavaScriptExecutor.Class6_FlashingElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class1_ChangeElementColor {
     public static void main(String[] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

         driver.get("https://www.twoplugs.com");

         WebElement joinFree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
         String bgColor = joinFree.getCssValue("backgroundColor");                          // Storing background color of element

         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].style.backgroundColor='#000000'", joinFree);        // Change the WebElement color

         Thread.sleep(5000);

         js.executeScript("arguments[0].style.backgroundColor='"+bgColor+"'",joinFree);     // Change the WebElement color


     }
}
