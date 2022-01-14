package Selenium.Class14_MouseOperation_ActionsClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class1_RightClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement rightClick_button = driver.findElement(By.xpath("//span[contains(@class, 'context-menu-one btn')]"));    // identify element
        Actions mouse = new Actions(driver);                               // passing WebDriver object reference in Actions class object
        mouse.contextClick(rightClick_button).perform();              /* pass the element on which you want to perform action
                                                                         contextClick().perform() method perform Right-click
                                                                      */

        List<WebElement> allOptions = driver.findElements(By.xpath("//li[contains(@class, 'context-menu-item')]/span"));
        for(WebElement option : allOptions){
            String optionText = option.getText();
            if(optionText.equalsIgnoreCase("quit")){
                option.click();
                break;
            }
        }

    }
}
