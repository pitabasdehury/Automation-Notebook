package Selenium.Class14_MouseOperation_ActionsClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class3_MouseHover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://mrbool.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement contentElement = driver.findElement(By.className("menulink"));   // locating element

        Actions mouse = new Actions(driver);
        mouse.moveToElement(contentElement).perform();      // mouse hover on the element

        List<WebElement> allElements = driver.findElements(By.xpath("//ul[@class = 'submenu']/li"));
        for(WebElement element : allElements){
            String elementText = element.getText();
            if (elementText.equalsIgnoreCase("articles")){
                element.click();
                break;
            }
        }
    }
}
