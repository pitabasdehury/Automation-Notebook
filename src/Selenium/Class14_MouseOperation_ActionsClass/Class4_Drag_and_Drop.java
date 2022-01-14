package Selenium.Class14_MouseOperation_ActionsClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Class4_Drag_and_Drop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']")); // identify frame
        driver.switchTo().frame(frame1);                                                  // switch to frame

        WebElement dragMeElement = driver.findElement(By.id("draggable"));          // identify drag element
        WebElement dropElement = driver.findElement(By.id("droppable"));            // identify drop element

        Actions mouse = new Actions(driver);
        mouse.dragAndDrop(dragMeElement,dropElement).perform();    // drag element from source and drop on target
    }
}
