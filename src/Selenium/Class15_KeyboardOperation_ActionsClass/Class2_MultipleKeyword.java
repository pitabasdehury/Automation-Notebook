package Selenium.Class15_KeyboardOperation_ActionsClass;

// Performing multiple keys action from keyboard

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Class2_MultipleKeyword {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://text-compare.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement inputBox1 = driver.findElement(By.id("inputText1"));
        inputBox1.sendKeys("I am learning Selenium programming.");
        WebElement inputBox2 = driver.findElement(By.id("inputText2"));

        Actions keyboard = new Actions(driver);

        // Steps to copy the text and paste on the other box

        // 1. CTRL + A
        keyboard.keyDown(Keys.CONTROL);             // press Ctrl key
        keyboard.sendKeys("a");                     // press 'a'
        keyboard.keyUp(Keys.CONTROL);               // release Ctrl key
        keyboard.perform();                         // to build the desired action and perform it

        // 2. CTRL + C
        keyboard.keyDown(Keys.CONTROL);
        keyboard.sendKeys("c");
        keyboard.keyUp(Keys.CONTROL);
        keyboard.perform();

        // 3. TAB - shift to inputBox2
        keyboard.sendKeys(Keys.TAB);
        keyboard.perform();

        // 4. CTRL + V
        keyboard.keyDown(Keys.CONTROL);
        keyboard.sendKeys("v");
        keyboard.keyUp(Keys.CONTROL);
        keyboard.perform();

        // verifying the copy-paste action
        if (inputBox1.getAttribute("value").equals(inputBox2.getAttribute("value"))){
            System.out.println("The value paste successfully.");
        }


    }
}